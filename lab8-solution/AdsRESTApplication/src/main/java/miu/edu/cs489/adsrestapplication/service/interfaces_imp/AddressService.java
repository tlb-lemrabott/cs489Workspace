package miu.edu.cs489.adsrestapplication.service.interfaces_imp;

import miu.edu.cs489.adsrestapplication.deo.address.AddressRequest;
import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse;
import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse2;
import miu.edu.cs489.adsrestapplication.deo.patient.PatientResponse2;
import miu.edu.cs489.adsrestapplication.model.Address;
import miu.edu.cs489.adsrestapplication.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements miu.edu.cs489.adsrestapplication.service.interfaces.AddressService {
    private AddressRepository addressRepository;
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public AddressResponse addNewAddress(AddressRequest addressRequest) {
        return null;
    }

    @Override
    public Address updateAddress(Integer id, Address address) {
        return null;
    }

    @Override
    public Address getAddressById(Integer id) {
        return null;
    }

    @Override
    public List<AddressResponse2> getAllAddresses() {
        return this.addressRepository.findAll()
                .stream()
                .map(a -> new AddressResponse2(
                        a.getAddressId(),
                        a.getStreet(),
                        a.getCity(),
                        a.getState(),
                        a.getZipCode(),
                        a.getApt(),
                        (a.getPatient() != null)? new PatientResponse2(
                            a.getPatient().getPatientId(),
                            a.getPatient().getPatName(),
                            a.getPatient().getPhone(),
                            a.getPatient().getEmail()
                        ): null
                )).toList();
    }

    @Override
    public boolean deleteAddressById(Integer id) {
        return false;
    }
}
