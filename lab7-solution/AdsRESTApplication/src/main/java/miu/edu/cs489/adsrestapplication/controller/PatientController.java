package miu.edu.cs489.adsrestapplication.controller;

import jakarta.validation.Valid;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientRequest;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse;
import miu.edu.cs489.adsrestapplication.exception.PatientNotFoundException;
import miu.edu.cs489.adsrestapplication.model.Patient;
import miu.edu.cs489.adsrestapplication.service.interfaces_imp.PatientServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/adsapp/api/v1/patient")
public class PatientController {
    private PatientServiceImp patientService;
    public PatientController(PatientServiceImp patientService) {
        this.patientService = patientService;
    }
    @PostMapping(value = "/new")
    public ResponseEntity<PatientResponse> registerNewPatient(@Valid @RequestBody PatientRequest patientRequest) {
        return new ResponseEntity<>(patientService.registerNewPatient(patientRequest), HttpStatus.CREATED);
    }
    @PutMapping(value = "/update/{patientId}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Integer patientId, @RequestBody Patient editPatient) {
        return new ResponseEntity<>(patientService.updatePatient(patientId, editPatient), HttpStatus.OK);
    }
    @GetMapping(value = "/{patientId}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Integer patientId) throws PatientNotFoundException {
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }
    @GetMapping(value = "/search/{patName}")
    public ResponseEntity<List<Patient>> getPatientByName(@PathVariable String patName) throws PatientNotFoundException{
        return ResponseEntity.ok(patientService.getPatientByName(patName));
    }
    @GetMapping(value = "/list")
    public ResponseEntity<List<PatientResponse>> getAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatients());
    }
    @DeleteMapping(value = "/delete/{patientId}")
    public ResponseEntity<Void> deletePatientById(@PathVariable Integer patientId) {
        patientService.deletePatientById(patientId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
