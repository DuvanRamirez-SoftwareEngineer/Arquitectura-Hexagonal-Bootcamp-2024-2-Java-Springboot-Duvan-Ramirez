package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.repository;

import com.emazon.emazonarquitecturahexagonal.domain.model.Brand;
import com.emazon.emazonarquitecturahexagonal.domain.repository.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandRepositoryImpl implements BrandRepository {

    private final List<Brand> brands = new ArrayList<>();

    @Override
    public List<Brand> findAll() {
        return brands;
    }

    @Override
    public Brand save(Brand brand) {
        brands.add(brand);
        return brand;
    }

    @Override
    public void deleteById(Long id) {
        brands.removeIf(brand -> brand.getId().equals(id));
    }
}
