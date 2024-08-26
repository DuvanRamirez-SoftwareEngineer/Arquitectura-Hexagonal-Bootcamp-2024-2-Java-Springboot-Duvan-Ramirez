package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.mapper;

import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.ProductEntity;
import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.CategoryEntity;
import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import com.emazon.emazonarquitecturahexagonal.domain.model.Category;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public Product toDomain(ProductEntity productEntity) {
        if (productEntity == null) {
            return null;
        }

        List<Category> categories = (productEntity.getCategories() != null)
                ? productEntity.getCategories().stream()
                .map(entity -> toCategoryDomain((CategoryEntity) entity))
                .collect(Collectors.toList())
                : Collections.emptyList();

        return new Product(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getQuantity(),
                productEntity.getPrice(),
                categories
        );
    }

    private Category toCategoryDomain(CategoryEntity categoryEntity) {
        if (categoryEntity == null) {
            return null;
        }
        return new Category(
                categoryEntity.getId(),
                categoryEntity.getName(),
                categoryEntity.getDescription()
        );
    }

    public ProductEntity toEntity(Product product) {
        if (product == null) {
            return null;
        }

        List<CategoryEntity> categoryEntities = (product.getCategories() != null)
                ? product.getCategories().stream()
                .map(category -> toCategoryEntity(category))
                .collect(Collectors.toList())
                : Collections.emptyList();

        return new ProductEntity(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getQuantity(),
                product.getPrice(),
                categoryEntities
        );
    }

    private CategoryEntity toCategoryEntity(Category category) {
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
