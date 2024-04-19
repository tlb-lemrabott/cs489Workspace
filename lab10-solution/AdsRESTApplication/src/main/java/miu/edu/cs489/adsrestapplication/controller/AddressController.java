package miu.edu.cs489.adsrestapplication.controller;

import miu.edu.cs489.adsrestapplication.deo.address.AddressResponse2;
import miu.edu.cs489.adsrestapplication.model.Address;
import miu.edu.cs489.adsrestapplication.service.interfaces_imp.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/adsapp/api/v1/address")
public class AddressController {
    private AddressService addressService;
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
    public ResponseEntity<AddressResponse2> addNewAddress(Address address) {
        return null;
    }
    public Address updateAddress(Integer id, Address address) {
        return null;
    }
    public Address getAddressById(Integer id) {
        return null;
    }
    @GetMapping(value = "/list")
    public ResponseEntity<List<AddressResponse2>> getAllAddresses() {
        return ResponseEntity.ok(addressService.getAllAddresses());
    }
    public boolean deleteAddressById(Integer id) {
        return false;
    }


}
