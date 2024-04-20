package miu.edu.cs489.adsrestapplication.controller;

import jakarta.transaction.Transactional;
import miu.edu.cs489.adsrestapplication.AbstractAdsRestAppComponentTest;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse;
import miu.edu.cs489.adsrestapplication.model.Patient;
import miu.edu.cs489.adsrestapplication.service.interfaces.PatientService;
import miu.edu.cs489.adsrestapplication.service.interfaces_imp.PatientServiceImp;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = PatientController.class)
@AutoConfigureMockMvc
//@SpringBootTest
//@Transactional
class PatientControllerUnitTest {
    @InjectMocks
    private PatientController patientController;
    @MockBean
    private PatientServiceImp patientService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testListPatients() throws Exception {
        List<PatientResponse> patients = Arrays.asList(
                new PatientResponse(1,"Michel", "(911) 845-8493",
                        "michel29@gmail.com", null,
                        LocalDate.of(2011,9,13)),
                new PatientResponse(2,"Jack", "(800) 911-0123",
                        "jackemail@gmail.com", null,
                        LocalDate.of(1996,3,21)),
                new PatientResponse(1,"John", "(522) 139-1063",
                        "michel29@gmail.com", null,
                        LocalDate.of(2000,5,01))
        );
        Mockito.when(patientService.getAllPatients()).thenReturn(patients);
        ResponseEntity<List<PatientResponse>> responseEntity = patientController.getAllPatients();

        verify(patientService, times(1)).getAllPatients();

        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List<PatientResponse> responseBody = responseEntity.getBody();
        Assertions.assertEquals(3, responseBody.size());

    }


}