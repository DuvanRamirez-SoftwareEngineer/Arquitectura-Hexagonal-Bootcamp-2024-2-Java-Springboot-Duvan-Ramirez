package com.emazon.emazonarquitecturahexagonal.adapters.driving.http.dto.response;

import com.emazon.emazonarquitecturahexagonal.domain.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
    private List<Category> categories;
    private boolean valid;
    private boolean validName;
    private boolean validDescription;
    private boolean validQuantity;
    private boolean validPrice;
    private boolean validCategories;
}
