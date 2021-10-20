package com.hairby.estelle.api.hairbyestellebackend.address;

import com.hairby.estelle.api.hairbyestellebackend.client.Client;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String country;
    private String city;
    private String street;
    private String postalCode;

    @OneToOne(mappedBy = "address")
    private Client client;

    public Address(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    public Address(String country, String city, String street, String postalCode, Client client) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.client = client;
    }
}
