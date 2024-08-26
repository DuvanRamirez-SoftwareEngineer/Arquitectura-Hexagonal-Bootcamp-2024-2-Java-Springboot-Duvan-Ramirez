package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.adapter;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryAdapter {

    public Category toDomain(CategoryEntity categoryEntity) {
        if (categoryEntity == null) {
            return null;
        }
        return new Category(
                categoryEntity.getId(),
                categoryEntity.getName(),
                categoryEntity.getDescription()
        );
    }

    public CategoryEntity toEntity(Category category) {
        if (category == null) {
            return null;
        }
        return new CategoryEntity(
                category.getId(),
                category.getName(),
                category.getDescription()
        );
    }
}
