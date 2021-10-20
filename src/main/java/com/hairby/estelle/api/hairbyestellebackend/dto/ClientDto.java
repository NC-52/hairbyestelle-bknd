package com.hairby.estelle.api.hairbyestellebackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public ClientDto(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
}
