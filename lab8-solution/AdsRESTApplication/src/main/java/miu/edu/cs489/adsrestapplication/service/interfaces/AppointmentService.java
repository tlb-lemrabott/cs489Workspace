package miu.edu.cs489.adsrestapplication.service.interfaces;

import miu.edu.cs489.adsrestapplication.model.Appointment;
import miu.edu.cs489.adsrestapplication.model.Surgery;

import java.util.List;

public interface AppointmentService {
    public Appointment addNewAppointment(Appointment appointment);
    public Appointment updateAppointment(Integer id, Appointment appointment);
    public Appointment getAppointmentById(Integer id);
    public List<Appointment> getAllAppointments(Appointment appointment);
    public boolean deleteAppointmentById(Integer id);
}
