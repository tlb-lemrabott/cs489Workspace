package miu.edu.cs489.adsrestapplication.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String apt;

    public Address(Integer addressId, String street, String city, String state, String zipCode, String apt) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.apt = apt;
    }
    @JsonBackReference
    @OneToOne(mappedBy = "patientAddress")
    private Patient patient;

    @JsonBackReference
    @OneToOne(mappedBy = "surgeryAddress")
    private Surgery surgery;

}
