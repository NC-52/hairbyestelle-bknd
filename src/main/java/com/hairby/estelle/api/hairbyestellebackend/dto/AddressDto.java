package com.hairby.estelle.api.hairbyestellebackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDto {
    private String country;
    private String city;
    private String street;
    private String postalCode;

    public AddressDto(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
}
