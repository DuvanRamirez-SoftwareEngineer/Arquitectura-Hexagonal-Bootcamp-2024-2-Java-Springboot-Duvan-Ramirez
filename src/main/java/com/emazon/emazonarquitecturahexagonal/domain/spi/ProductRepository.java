package com.emazon.emazonarquitecturahexagonal.domain.spi;

import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product save(Product product);
    void deleteById(Long id);
}
