package com.example.skyprospringhomework211.service;

import com.example.skyprospringhomework211.exception.OrderBadParamException;
import com.example.skyprospringhomework211.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class OrderServiceImpl implements OrderService {

    private final int CAPACITY = 10;
    public List<Product> cart = new ArrayList<>(CAPACITY);

    @Override
    public void addProductToCart(Integer... id) {
        int cnt = 0;
        for (int i = 0; i < id.length-1; i++) {
            try {
                if (!id[i].equals(null)) {
                    Product product = new Product(id[i]);
                    cart.add(product);
                    cnt++;
                }
            }
            catch (NullPointerException e) {
                if (cnt == 0) {
                    throw new OrderBadParamException();
                }
            }
        }
    }

    @Override
    public List<Product> getProductsInCart() {
        return Collections.unmodifiableList(cart);
    }
}


