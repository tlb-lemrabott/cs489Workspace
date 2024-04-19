package miu.edu.cs489.adsrestapplication.deo.address;

public record AddressRequest (
        String street,
        String city,
        String state,
        String zipCode,
        String apt
){

}
