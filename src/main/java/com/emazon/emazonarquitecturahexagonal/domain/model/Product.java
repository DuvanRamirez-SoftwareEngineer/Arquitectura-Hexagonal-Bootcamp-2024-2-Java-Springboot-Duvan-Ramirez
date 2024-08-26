package com.emazon.emazonarquitecturahexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
    private List<Category> categories;

    public Product(Long id, String name, String description, Integer quantity, Double price, List<Category> categories) {
    }

    public boolean isValidName() {
        return name != null && !name.trim().isEmpty() && name.length() <= 50;
    }

    public boolean isValidDescription() {
        return description != null && !description.trim().isEmpty() && description.length() <= 90;
    }

    public boolean isValidQuantity() {
        return quantity >= 0;
    }

    public boolean isValidPrice() {
        return price != null && price.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isValidCategories() {
        return categories != null && !categories.isEmpty() && categories.size() <= 3;
    }

    public boolean isValid() {
        return isValidName() && isValidDescription() && isValidQuantity() && isValidPrice() && isValidCategories();
    }
}
