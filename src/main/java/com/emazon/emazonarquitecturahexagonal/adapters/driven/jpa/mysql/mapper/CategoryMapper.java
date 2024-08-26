package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.mapper;

import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.emazon.emazonarquitecturahexagonal.domain.model.Category;

import java.util.List;

public class CategoryMapper {
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
        return null;
    }

    public List<Category> toDomainList(List<CategoryEntity> all) {
        return List.of();
    }
}
