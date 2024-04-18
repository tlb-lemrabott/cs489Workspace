package miu.edu.cs489.adsrestapplication.deo.patient;

import miu.edu.cs489.adsrestapplication.deo.address.AddressRequest;

import java.time.LocalDate;

public record PatientRequest (
        String patName,
        String phone,
        String email,
        AddressRequest addressRequest
){
}
