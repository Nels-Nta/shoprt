package com.ntabana.shopritebackend.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/SaveCart")
    public String SaveCart(@RequestBody Cart cart) {
        cartService.save(cart);
        return "Cart Saved";
    }
    @RequestMapping("/allcarts")
    public List<Cart> getAllCarts() {
        return cartService.getAllcarts();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCart(@PathVariable Long id) {
        cartService.deleteById(id);
        return ("User deleted successfully");
    }
    @RequestMapping("/cart/{id}")
    public String get(@PathVariable Long id) {
        cartService.findById(id);
        return "Cart found";
    }

}

