package com.emazon.emazonarquitecturahexagonal.domain.api;

import com.emazon.emazonarquitecturahexagonal.domain.model.Product;
import java.util.List;

public interface IProductServicePort {
    List<Product> listAllProducts();
    Product createProduct(Product product);
    void deleteProduct(Long id);
}
