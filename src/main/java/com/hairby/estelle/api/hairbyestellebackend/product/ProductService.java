package com.hairby.estelle.api.hairbyestellebackend.product;

import com.hairby.estelle.api.hairbyestellebackend.category.CategoryRepository;
import com.hairby.estelle.api.hairbyestellebackend.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    @Autowired
    private final ProductRepository mProductRepository;

    @Autowired
    private final CategoryRepository mCategoryRepository;

    public Product addProduct(final ProductDto p) {
        Product product = new Product();
        product.setName(p.getName());
        product.setPrice(p.getPrice());
        product.setDescription(p.getDescription());
        product.setQuantity(p.getQuantity());
        p.setImageUrl(p.getImageUrl());
        return mProductRepository.save(product);
    }

    public Iterable<Product> fetchAllProducts() {
        return mProductRepository.findAll();
    }

    public Product setProductCategory(final Long categoryID, final Long productId) {
        Product product = getProductById(productId);
        product.setCategory(mCategoryRepository.findById(categoryID).get());
        return mProductRepository.save(product);
    }


    public Product updateProduct(final Long productId, final Product product) {
        Product productById = getProductById(productId);
        product.setId(productById.getId());
        return mProductRepository.save(product);
    }

    private Product getProductById(Long productId) {
        Optional<Product> byId = mProductRepository.findById(productId);
        if (byId.isEmpty()) {
            throw new ProductNotFoundException(String.format("Product with ID %s not found", productId));
        }
        return byId.get();
    }

}
