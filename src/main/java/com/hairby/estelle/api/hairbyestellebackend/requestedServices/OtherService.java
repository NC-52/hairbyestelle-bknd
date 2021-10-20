package com.hairby.estelle.api.hairbyestellebackend.requestedServices;

import com.hairby.estelle.api.hairbyestellebackend.address.Address;
import com.hairby.estelle.api.hairbyestellebackend.share.ServiceStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class OtherService {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private BigDecimal price;
    private String description;
    private LocalDateTime dueTo;

    @Enumerated(EnumType.STRING)
    private ServiceStatus status;

    @OneToOne
    private Address address;
}
