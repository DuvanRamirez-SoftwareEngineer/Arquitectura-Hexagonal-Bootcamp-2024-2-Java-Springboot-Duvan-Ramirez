package com.emazon.emazonarquitecturahexagonal.adapters.driven.jpa.mysql.repository;

import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import com.emazon.emazonarquitecturahexagonal.domain.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }

    @Override
    public void deleteById(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}
