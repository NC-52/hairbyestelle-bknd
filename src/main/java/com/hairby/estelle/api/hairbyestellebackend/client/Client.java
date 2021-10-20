package com.hairby.estelle.api.hairbyestellebackend.client;

import com.hairby.estelle.api.hairbyestellebackend.address.Address;
import com.hairby.estelle.api.hairbyestellebackend.order.Order;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String firstName;
    private String lastName;

    @Email
    private String email;

    @NotNull
    private String phone;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;

    public Client(@NotNull String firstName,
                  String lastName,
                  @Email String email,
                  @NotNull String phone,
                  Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
