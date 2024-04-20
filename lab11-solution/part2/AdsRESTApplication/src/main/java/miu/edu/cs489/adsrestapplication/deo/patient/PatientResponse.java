package miu.edu.cs489.adsrestapplication.deo.patient;

import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse;

import java.time.LocalDate;

public record PatientResponse (
        Integer patientId,
        String patName,
        String phone,
        String email,
        AddressResponse patientAddress,
        LocalDate birthDate
){
}
