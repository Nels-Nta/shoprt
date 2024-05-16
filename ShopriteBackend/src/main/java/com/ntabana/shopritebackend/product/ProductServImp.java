package com.ntabana.shopritebackend.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServImp implements ProductService {
    @Autowired
    private ProductRepo productRepo;



    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void deleteById(Long id) {
         productRepo.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


}
