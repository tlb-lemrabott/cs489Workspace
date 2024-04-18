package miu.edu.cs489.adsrestapplication.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

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
//    @Temporal(TemporalType.TIMESTAMP)
    //@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    //@DateTimeFormat(pattern = "yyyy-mm-dd hh:mm:ss")
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
