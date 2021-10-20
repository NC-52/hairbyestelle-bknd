package com.hairby.estelle.api.hairbyestellebackend.order;

import com.hairby.estelle.api.hairbyestellebackend.client.Client;
import com.hairby.estelle.api.hairbyestellebackend.product.Product;
import com.hairby.estelle.api.hairbyestellebackend.share.ServiceStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ORDER_TABLE")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @Enumerated(EnumType.STRING)
    private ServiceStatus status;

    @CreationTimestamp
    private LocalDateTime orderDate;

    private LocalDateTime deliveryDate;

}
