package com.emazon.emazonarquitecturahexagonal.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {
    private String name;
    private String description;
    private int quantity;
    private BigDecimal price;
    private List<Long> categoryIds;  // IDs de las categorías asociadas
}
