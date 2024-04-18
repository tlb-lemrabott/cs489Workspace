package miu.edu.cs489.adsrestapplication.deo.address;

public record AddressResponse(
        Integer addressId,
        String street,
        String city,
        String state,
        String zipCode,
        String apt
) {
}
