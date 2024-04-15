package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import miu.edu.cs489.adsrestapplication.exception.PatientNotFoundException;
import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientRequest;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse;
import miu.edu.cs489.adsrestapplication.model.Address;
import miu.edu.cs489.adsrestapplication.model.Patient;
import miu.edu.cs489.adsrestapplication.repository.PatientRepository;
import miu.edu.cs489.adsrestapplication.service.interfaces.PatientService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.Objects;

@Service
public class PatientServiceImp implements PatientService {
    private PatientRepository patientRepository;
    public PatientServiceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
    @Override
    public PatientResponse registerNewPatient(PatientRequest patientRequest) {
        Patient newPatient = new Patient(null,
                patientRequest.patName(),
                patientRequest.phone(),
                patientRequest.email(),
                new Address(null,
                        patientRequest.addressRequest().street(),
                        patientRequest.addressRequest().city(),
                        patientRequest.addressRequest().state(),
                        patientRequest.addressRequest().zipCode(),
                        patientRequest.addressRequest().apt()
                ));
        Patient savedPatient = patientRepository.save(newPatient);
        return new PatientResponse(
                savedPatient.getPatientId(),
                savedPatient.getPatName(),
                savedPatient.getPhone(),
                savedPatient.getEmail(),
                savedPatient.getBirthDate(),
                new AddressResponse(
                        savedPatient.getPatientAddress().getAddressId(),
                        savedPatient.getPatientAddress().getStreet(),
                        savedPatient.getPatientAddress().getCity(),
                        savedPatient.getPatientAddress().getState(),
                        savedPatient.getPatientAddress().getZipCode(),
                        savedPatient.getPatientAddress().getApt()
                )
        );
    }
    @Override
    public Patient updatePatient(Integer patientId, Patient editPatient) {
        Patient patient = patientRepository.findById(patientId).orElse(null);
        System.out.println("patient = " + patient);
        if(Objects.nonNull(patient)) {
            System.out.println("patient.getPatientAddress = " + patient.getPatientAddress());
            patient.setPatName(editPatient.getPatName());
            patient.setPhone(editPatient.getPhone());
            patient.setEmail(editPatient.getEmail());
            if(Objects.nonNull(patient.getPatientAddress())) {
                Address address = patient.getPatientAddress();
                address.setStreet(editPatient.getPatientAddress().getStreet());
                address.setCity(editPatient.getPatientAddress().getCity());
                address.setState(editPatient.getPatientAddress().getState());
                address.setState(editPatient.getPatientAddress().getZipCode());
                address.setZipCode(editPatient.getPatientAddress().getApt());
            } else {
                Address newAddress = new Address();
                newAddress.setStreet(editPatient.getPatientAddress().getStreet());
                newAddress.setCity(editPatient.getPatientAddress().getCity());
                newAddress.setState(editPatient.getPatientAddress().getState());
                newAddress.setZipCode(editPatient.getPatientAddress().getZipCode());
                newAddress.setZipCode(editPatient.getPatientAddress().getApt());
                newAddress.setPatient(patient);
                patient.setPatientAddress(newAddress);
            }
            return patientRepository.save(patient);
        } else {
            return null;
        }
    }

    @Override
    public Patient getPatientById(Integer idPatient) throws PatientNotFoundException {
        return this.patientRepository.findById(idPatient)
                .orElseThrow(() ->
                        new PatientNotFoundException(String.format("Error: Publisher with Id, %d, is not found",
                        idPatient
                        ))
                );
    }

    @Override
    public List<Patient> getPatientByName(String patName) throws PatientNotFoundException{
        return this.patientRepository.findAllByPatName(patName)
                .orElseThrow(() ->
                        new PatientNotFoundException(String.format("Error: Publisher with Name, %d, is not found",
                                patName
                        ))
                );
    }

    @Override
    public List<PatientResponse> getAllPatients() {
        return this.patientRepository.findAll(Sort.by("patName"))
                .stream()
                .map(p -> new PatientResponse(
                        p.getPatientId(),
                        p.getPatName(),
                        p.getPhone(),
                        p.getEmail(),
                        p.getBirthDate(),
                        (p.getPatientAddress() != null)? new AddressResponse(
                                p.getPatientAddress().getAddressId(),
                                p.getPatientAddress().getStreet(),
                                p.getPatientAddress().getCity(),
                                p.getPatientAddress().getState(),
                                p.getPatientAddress().getZipCode(),
                                p.getPatientAddress().getApt()
                        ):null
                )).toList();
    }

    @Override
    public void deletePatientById(Integer patientId) {
        if(this.patientRepository.findById(patientId).isPresent()){
            this.patientRepository.deleteById(patientId);
        }
    }
}
