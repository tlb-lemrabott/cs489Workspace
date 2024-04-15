package miu.edu.cs489.adsrestapplication.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String patName;
    private String phone;
    private String email;
    private LocalDate birthDate;

    public Patient(Integer patientId, String patName, String phone, String email, Address patientAddress) {
        this.patientId = patientId;
        this.patName = patName;
        this.phone = phone;
        this.email = email;
        this.patientAddress = patientAddress;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id_fk", nullable = true, unique = true)
    @JsonManagedReference
    private Address patientAddress;

    @OneToMany(mappedBy = "patientAppointment")
    private List<Appointment> appointments;

}
