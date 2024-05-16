package com.ntabana.shopritebackend.product;

import java.util.List;

public interface ProductService{
    Product findById(Long id);
    Product save(Product product);
    void deleteById(Long id);
    List<Product> getAllProducts();

}
