package com.hairby.estelle.api.hairbyestellebackend.category;

import com.hairby.estelle.api.hairbyestellebackend.product.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> mProductList;

    public Category(String name) {
        this.name = name;
    }
}
