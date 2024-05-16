package com.ntabana.shopritebackend.Cart;


import java.util.List;

public interface CartService {

    Cart save(Cart cart);
    List<Cart> getAllcarts( );
    Cart findById(Long id);
    void deleteById(Long id);

}
