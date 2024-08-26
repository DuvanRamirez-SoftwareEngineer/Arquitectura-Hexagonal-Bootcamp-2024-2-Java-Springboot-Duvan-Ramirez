package com.emazon.emazonarquitecturahexagonal.adapters.driving.http.mapper;

import com.emazon.emazonarquitecturahexagonal.adapters.driving.http.dto.response.ProductResponse;
import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductResponse toResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getQuantity(),
                product.getPrice(),
                product.getCategories(),
                product.isValid(),
                product.isValidName(),
                product.isValidDescription(),
                product.isValidQuantity(),
                product.isValidPrice(),
                product.isValidCategories()
        );
    }
}
