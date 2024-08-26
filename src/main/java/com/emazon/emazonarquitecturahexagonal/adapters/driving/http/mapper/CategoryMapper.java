package com.emazon.emazonarquitecturahexagonal.adapters.driving.http.mapper;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import com.emazon.emazonarquitecturahexagonal.adapters.driving.http.dto.response.CategoryResponse;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public CategoryResponse toResponse(Category category) {
        return new CategoryResponse(
                category.getId(),
                category.getName(),
                category.getDescription()
        );
    }
}
