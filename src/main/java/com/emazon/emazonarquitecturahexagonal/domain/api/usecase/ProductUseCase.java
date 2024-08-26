package com.emazon.emazonarquitecturahexagonal.domain.api.usecase;

import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import com.emazon.emazonarquitecturahexagonal.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ProductUseCase {

    private final ProductRepository productRepository;

    public Product createProduct(Product product) {
        if (!product.isValid()) {
            throw new RuntimeException("Invalid product data");
        }
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
