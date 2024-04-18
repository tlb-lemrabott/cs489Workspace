package miu.edu.cs489.adsrestapplication.repository;

import miu.edu.cs489.adsrestapplication.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
    public Optional<List<Patient>> findAllByPatName(String name);

}
