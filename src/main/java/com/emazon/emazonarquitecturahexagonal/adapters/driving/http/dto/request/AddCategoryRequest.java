package com.emazon.emazonarquitecturahexagonal.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryRequest {
    private String name;
    private String description;
}
