package com.hairby.estelle.api.hairbyestellebackend.product;

import com.hairby.estelle.api.hairbyestellebackend.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/api/v1/products"})
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService mProductService;

    @GetMapping
    public ResponseEntity<Iterable<Product>> getProducts() {
        return new ResponseEntity<>(mProductService.fetchAllProducts(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(final @RequestBody ProductDto product) {
        return new ResponseEntity<>(mProductService.addProduct(product), HttpStatus.CREATED);
    }

    @PostMapping(path = {"/{productId}"})
    public ResponseEntity<Product> updateProductCategory(final @RequestBody Long categoryId, final @PathVariable Long productId) {
        return new ResponseEntity<>(mProductService.setProductCategory(categoryId, productId), HttpStatus.OK);
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Product> updateProduct(final @PathVariable Long id, final @RequestBody Product product) {
        return new ResponseEntity<>(mProductService.updateProduct(null, product), HttpStatus.OK);
    }
}
