package com.emazon.emazonarquitecturahexagonal.domain.api;

import com.emazon.emazonarquitecturahexagonal.domain.model.Brand;
import java.util.List;

public interface IBrandServicePort {
    List<Brand> listAllBrands();
    Brand createBrand(Brand brand);
    void deleteBrand(Long id);
}
