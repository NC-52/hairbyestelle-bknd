package com.hairby.estelle.api.hairbyestellebackend.product;

import com.hairby.estelle.api.hairbyestellebackend.category.Category;
import com.hairby.estelle.api.hairbyestellebackend.order.Order;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Product name is required")
    private String name;

    @NotNull(message = "Provide product price")
    private BigDecimal price;

    @NotNull(message = "Product description is required")
    private String description;

    private Integer quantity;

    @ManyToOne
    private Category category;

    @NotNull(message = "Url for image link cannot be null")
    private String imageUrl;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private Boolean deleted = false;
}
