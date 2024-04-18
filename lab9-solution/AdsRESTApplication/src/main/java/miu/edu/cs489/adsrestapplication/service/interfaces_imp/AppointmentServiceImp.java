package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import miu.edu.cs489.adsrestapplication.model.Appointment;
import miu.edu.cs489.adsrestapplication.repository.AppointmentRepository;
import miu.edu.cs489.adsrestapplication.service.interfaces.AppointmentService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

@Service
public class AppointmentServiceImp implements AppointmentService {
    private AppointmentRepository appointmentRepository;
    public AppointmentServiceImp(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Appointment addNewAppointment(Appointment appointment) {
        if(Objects.nonNull(appointment)){
            return appointmentRepository.save(appointment);
        }else {
            return null;
        }
    }

    @Override
    public Appointment updateAppointment(Integer id, Appointment appointment) {
        return null;
    }

    @Override
    public Appointment getAppointmentById(Integer id) {
        return null;
    }

    @Override
    public List<Appointment> getAllAppointments(Appointment appointment) {
        return null;
    }

    @Override
    public boolean deleteAppointmentById(Integer id) {
        return false;
    }
}
