package com.hairby.estelle.api.hairbyestellebackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class ProductDto {
    private String name;
    private BigDecimal price;
    private String description;
    private Integer quantity;
    private String imageUrl;

    public ProductDto(String name, BigDecimal price, String description, Integer quantity, String imageUrl) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
    }
}
