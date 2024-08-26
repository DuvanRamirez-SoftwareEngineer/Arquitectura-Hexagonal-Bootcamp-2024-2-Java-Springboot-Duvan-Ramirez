package com.emazon.emazonarquitecturahexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long id;

    private String name;

    private String description;

    // Métodos adicionales, como validaciones, pueden ser agregados aquí

    public boolean isValidName() {
        return name != null && !name.trim().isEmpty() && name.length() <= 50;
    }


    public boolean isValidDescription() {
        return description != null && !description.trim().isEmpty() && description.length() <= 90;
    }


    public boolean isValid() {
        return isValidName() && isValidDescription();
    }


    public boolean hasSameName(Category other) {
        if (other == null || other.getName() == null || this.name == null) {
            return false;
        }
        return this.name.equalsIgnoreCase(other.getName());
    }
}
