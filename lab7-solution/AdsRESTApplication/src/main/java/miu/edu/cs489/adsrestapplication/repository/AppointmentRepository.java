package miu.edu.cs489.adsrestapplication.repository;

import miu.edu.cs489.adsrestapplication.model.Appointment;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends ListCrudRepository<Appointment, Integer> {

}
