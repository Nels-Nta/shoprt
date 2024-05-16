package com.ntabana.shopritebackend.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartSerImp implements CartService {


    @Autowired
    private CartRepo cartRepo;

    @Override
    public Cart save(Cart cart) {
        return cartRepo.save(cart);
    }

    @Override
    public List<Cart> getAllcarts() {
        return cartRepo.findAll();
    }

    @Override
    public Cart findById(Long id) {
        return cartRepo.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
         cartRepo.deleteById(id);
    }


}
