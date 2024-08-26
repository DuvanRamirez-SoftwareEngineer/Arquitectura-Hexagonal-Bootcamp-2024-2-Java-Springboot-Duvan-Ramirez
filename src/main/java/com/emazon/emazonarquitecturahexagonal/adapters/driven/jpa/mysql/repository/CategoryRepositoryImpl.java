package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.repository;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import com.emazon.emazonarquitecturahexagonal.domain.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final List<Category> categories = new ArrayList<>();

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public Category save(Category category) {
        categories.add(category);
        return category;
    }

    @Override
    public void deleteById(Long id) {
        categories.removeIf(category -> category.getId().equals(id));
    }
}
