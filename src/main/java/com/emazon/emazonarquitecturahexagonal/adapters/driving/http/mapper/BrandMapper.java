package com.emazon.emazonarquitecturahexagonal.adapters.driving.http.mapper;

import com.emazon.emazonarquitecturahexagonal.domain.model.Brand;
import com.emazon.emazonarquitecturahexagonal.adapters.driving.http.dto.response.BrandResponse;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {
    public BrandResponse toResponse(Brand brand) {
        return new BrandResponse(
                brand.getId(),
                brand.getName(),
                brand.getDescription()
        );
    }
}
