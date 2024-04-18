package miu.edu.cs489.adsrestapplication.deo.address;

import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse2;

public record AddressResponse2(
        Integer addressId,
        String street,
        String city,
        String state,
        String zipCode,
        String apt,
        PatientResponse2 patient
) {
}
