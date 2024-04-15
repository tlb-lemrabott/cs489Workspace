package miu.edu.cs489.adsrestapplication.service.interfaces;

import miu.edu.cs489.adsrestapplication.deo.address.AddressRequest;
import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse;
import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse2;
import miu.edu.cs489.adsrestapplication.model.Address;
import miu.edu.cs489.adsrestapplication.model.Surgery;

import java.util.List;

public interface AddressService {
    public AddressResponse addNewAddress(AddressRequest address);
    public Address updateAddress(Integer id, Address address);
    public Address getAddressById(Integer id);
    public List<AddressResponse2> getAllAddresses();
    public boolean deleteAddressById(Integer id);
}
