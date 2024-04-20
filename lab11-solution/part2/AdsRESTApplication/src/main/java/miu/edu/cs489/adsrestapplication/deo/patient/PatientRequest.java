package miu.edu.cs489.adsrestapplication.deo.patient;

import miu.edu.cs489.adsrestapplication.deo.address.AddressRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PatientRequest (
        String patName,
        String phone,
        String email,
        AddressRequest addressRequest,
        LocalDate patientAddress
){
}
