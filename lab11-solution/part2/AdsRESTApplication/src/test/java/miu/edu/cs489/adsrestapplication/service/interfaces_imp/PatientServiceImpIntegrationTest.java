package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import jakarta.transaction.Transactional;
import miu.edu.cs489.adsrestapplication.AbstractAdsRestAppComponentTest;
import miu.edu.cs489.adsrestapplication.exception.PatientNotFoundException;
import miu.edu.cs489.adsrestapplication.model.Patient;
import miu.edu.cs489.adsrestapplication.service.interfaces.PatientService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class PatientServiceImpIntegrationTest extends AbstractAdsRestAppComponentTest {
    @Autowired
    private PatientService patientService;

    @BeforeEach
    void setUp() {
        logger.info("PatientServiceImpIntegrationTest started");
    }

    @AfterEach
    void tearDown() {
        logger.info("PatientServiceImpIntegrationTest completed");
    }

    @Test
    void findExistingPatientByIdIntegrationTest() throws PatientNotFoundException {
        try{
            Integer patientId = 1;
            Patient foundedPatient = patientService.getPatientById(patientId);
            assertNotNull(foundedPatient);
            assertEquals(patientId, foundedPatient.getPatientId());
        }catch (PatientNotFoundException ex){
            logger.error("Error message: " + ex);
            throw ex;
        }
    }

    @Test
    void findNonExistingPatientByIdIntegrationTest() {
        Integer patientId = 0;
        assertThrows(PatientNotFoundException.class, () -> {
            patientService.getPatientById(patientId);
        });
    }

}