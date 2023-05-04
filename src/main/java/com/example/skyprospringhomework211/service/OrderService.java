package com.example.skyprospringhomework211.service;

import com.example.skyprospringhomework211.model.Product;

import java.util.List;

public interface OrderService {

    void addProductToCart(List<Integer> ids);

    List<Product> getProductsInCart();

}
