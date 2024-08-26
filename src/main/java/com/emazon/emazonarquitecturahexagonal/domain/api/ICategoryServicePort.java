package com.emazon.emazonarquitecturahexagonal.domain.api;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import java.util.List;

public interface ICategoryServicePort {
    List<Category> listAllCategories();
    Category createCategory(Category category);
    void deleteCategory(Long id);
}
