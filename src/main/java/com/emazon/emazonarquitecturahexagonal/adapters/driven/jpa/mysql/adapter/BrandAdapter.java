package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.adapter;

import com.emazon.emazonarquitecturahexagonal.domain.model.Brand;
import com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.entity.BrandEntity;
import org.springframework.stereotype.Component;

@Component
public class BrandAdapter {

    public Brand toDomain(BrandEntity brandEntity) {
        return new Brand(
                brandEntity.getId(),
                brandEntity.getName(),
                brandEntity.getDescription()
        );
    }

    public BrandEntity toEntity(Brand brand) {
        return new BrandEntity(
                brand.getId(),
                brand.getName(),
                brand.getDescription()
        );
    }
}
