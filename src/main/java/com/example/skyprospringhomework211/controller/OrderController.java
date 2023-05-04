package com.example.skyprospringhomework211.controller;

import com.example.skyprospringhomework211.model.Product;
import com.example.skyprospringhomework211.service.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam(required = false) List<Integer> ids) {
        orderService.addProductToCart(ids);
    }

    @GetMapping(path = "/get")
    public Collection<Product> get() {
        return orderService.getProductsInCart();
    }
}
