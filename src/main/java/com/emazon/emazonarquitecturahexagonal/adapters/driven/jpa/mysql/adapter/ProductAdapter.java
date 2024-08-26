package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.adapter;

import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.ProductEntity;
import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.CategoryEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductAdapter {

    private final CategoryAdapter categoryAdapter;

    public ProductAdapter(CategoryAdapter categoryAdapter) {
        this.categoryAdapter = categoryAdapter;
    }

    public Product toDomain(ProductEntity productEntity) {
        if (productEntity == null) {
            return null;
        }

        List<com.emazon.emazonarquitecturahexagonal.domain.model.Category> categories =
                productEntity.getCategories().stream()
                        .map(entity -> categoryAdapter.toDomain((CategoryEntity) entity)) // Cambiado a lambda
                        .collect(Collectors.toList());

        return new Product(
                productEntity.getId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getQuantity(),
                productEntity.getPrice(),
                categories
        );
    }

    public ProductEntity toEntity(Product product) {
        if (product == null) {
            return null;
        }

        List<CategoryEntity> categoryEntities =
                product.getCategories().stream()
                        .map(categoryAdapter::toEntity) // Cambiado a lambda
                        .collect(Collectors.toList());

        return new ProductEntity(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getQuantity(),
                product.getPrice(),
                categoryEntities
        );
    }
}
