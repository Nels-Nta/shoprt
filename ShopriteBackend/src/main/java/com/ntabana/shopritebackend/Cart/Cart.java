package com.ntabana.shopritebackend.Cart;

import com.ntabana.shopritebackend.product.Product;
import com.ntabana.shopritebackend.user.User;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date Purchasedate= new Date();
    @ManyToOne
    private User user;
    @ManyToMany
    private List<Product> products;



}
