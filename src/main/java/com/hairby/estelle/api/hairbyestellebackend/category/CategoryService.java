package com.hairby.estelle.api.hairbyestellebackend.category;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {

    @Autowired
    private final CategoryRepository mCategoryRepository;

    public Category addCategory(final Category category) {
        return mCategoryRepository.save(category);
    }

    public Optional<Category> getCategoryById(final Long id) {
        return mCategoryRepository.findById(id);
    }
}
