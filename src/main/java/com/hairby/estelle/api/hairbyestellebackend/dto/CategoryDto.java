package com.hairby.estelle.api.hairbyestellebackend.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDto {
    private String name;

    public CategoryDto(String name) {
        this.name = name;
    }
}
