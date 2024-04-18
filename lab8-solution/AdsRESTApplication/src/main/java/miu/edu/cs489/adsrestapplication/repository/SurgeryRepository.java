package miu.edu.cs489.adsrestapplication.repository;

import miu.edu.cs489.adsrestapplication.model.Surgery;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends ListCrudRepository<Surgery, Integer> {
}
