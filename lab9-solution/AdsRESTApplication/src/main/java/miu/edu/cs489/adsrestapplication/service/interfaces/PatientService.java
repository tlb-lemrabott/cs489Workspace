package miu.edu.cs489.adsrestapplication.service.interfaces;

import miu.edu.cs489.adsrestapplication.deo.patient.PatientRequest;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse;
import miu.edu.cs489.adsrestapplication.exception.PatientNotFoundException;
import miu.edu.cs489.adsrestapplication.model.*;

import java.util.List;

public interface PatientService {
    public PatientResponse registerNewPatient(PatientRequest patientRequest);
    public Patient updatePatient(Integer id, Patient patient);
    public Patient getPatientById(Integer id) throws PatientNotFoundException;
    public List<Patient> getPatientByName(String patName) throws PatientNotFoundException;
    public List<PatientResponse> getAllPatients();
    public void deletePatientById(Integer id);
}
