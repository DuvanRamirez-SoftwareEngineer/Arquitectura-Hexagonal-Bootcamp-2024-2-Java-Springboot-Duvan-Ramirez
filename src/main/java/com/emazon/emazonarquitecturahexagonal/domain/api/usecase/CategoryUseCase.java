package com.emazon.emazonarquitecturahexagonal.domain.api.usecase;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import com.emazon.emazonarquitecturahexagonal.domain.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CategoryUseCase {

    private final CategoryRepository categoryRepository;

    public Category createCategory(Category category) {
        // Aquí solo guardamos la categoría sin validar existencia previa
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public void deleteCategory(Long id) {
        // Eliminamos la categoría sin verificar si existe
        categoryRepository.deleteById(id);
    }
}
