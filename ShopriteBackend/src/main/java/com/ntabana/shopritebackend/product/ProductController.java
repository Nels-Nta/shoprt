package com.ntabana.shopritebackend.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Product product) {
        productService.save(product);
        return "product added successfully";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
        return "product deleted successfully";
    }
    @RequestMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        return productService.findById(id);
    }
    @RequestMapping("/all")
    public List<Product> getAllProducts() {
       return productService.getAllProducts();
    }

}
