package com.emazon.emazonarquitecturahexagonal.domain.api.usecase;

import com.emazon.emazonarquitecturahexagonal.domain.model.Brand;
import com.emazon.emazonarquitecturahexagonal.domain.repository.BrandRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class BrandUseCase {

    private final BrandRepository brandRepository;

    public Brand createBrand(Brand brand) {
        // Aquí solo guardamos la marca sin validar existencia previa
        return brandRepository.save(brand);
    }

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    public void deleteBrand(Long id) {
        // Eliminamos la marca sin verificar si existe
        brandRepository.deleteById(id);
    }
}
