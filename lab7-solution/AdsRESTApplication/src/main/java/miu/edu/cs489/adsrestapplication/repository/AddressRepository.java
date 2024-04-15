package miu.edu.cs489.adsrestapplication.repository;


import miu.edu.cs489.adsrestapplication.model.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ListCrudRepository<Address, Integer> {
}
