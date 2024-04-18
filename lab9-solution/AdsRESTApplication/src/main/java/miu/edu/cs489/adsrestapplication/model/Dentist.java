package miu.edu.cs489.adsrestapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Dentist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dentistId;
    private String dentistName;
    private String phone;
    private String email;
    private String speciality;
    @OneToMany(mappedBy = "dentistAppointment", cascade = CascadeType.ALL)
    private List<Appointment> appointments;
}
