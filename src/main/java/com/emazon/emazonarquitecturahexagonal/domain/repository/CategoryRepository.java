package com.emazon.emazonarquitecturahexagonal.domain.repository;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import java.util.List;

public interface CategoryRepository {
    List<Category> findAll();
    Category save(Category category);
    void deleteById(Long id);
}
