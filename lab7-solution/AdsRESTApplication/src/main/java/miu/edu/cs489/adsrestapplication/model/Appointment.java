package miu.edu.cs489.adsrestapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Appointment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer appointmentId;
    private LocalDateTime scheduleTime;

    @ManyToOne
    @JoinColumn(name = "patient_id_fk", unique = false)
    private Patient patientAppointment;

    @ManyToOne
    @JoinColumn(name = "dentist_id_fk", unique = false)
    private Dentist dentistAppointment;

    @ManyToOne
    @JoinColumn(name = "surgery_id_fk", unique = false)
    private Surgery surgeryAppointment;





}
