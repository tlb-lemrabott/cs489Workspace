package miu.edu.cs489.adsrestapplication.deo.patient;

public record PatientResponse2(
        Integer patientId,
        String patName,
        String phone,
        String email
) {
}
