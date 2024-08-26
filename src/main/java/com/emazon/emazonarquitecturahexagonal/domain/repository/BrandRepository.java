package com.emazon.emazonarquitecturahexagonal.domain.repository;

import com.emazon.emazonarquitecturahexagonal.domain.model.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> findAll();

    Brand save(Brand brand);

    void deleteById(Long id);
}
