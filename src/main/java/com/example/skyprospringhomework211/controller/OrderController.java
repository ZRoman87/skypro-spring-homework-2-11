package com.example.skyprospringhomework211.controller;

import com.example.skyprospringhomework211.model.Product;
import com.example.skyprospringhomework211.service.OrderServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderServiceImpl orderService;

    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam(required = false) Integer id1,
                    @RequestParam(required = false) Integer id2,
                    @RequestParam(required = false) Integer id3,
                    @RequestParam(required = false) Integer id4,
                    @RequestParam(required = false) Integer id5
    ) {
        Integer[] id = {id1, id2, id3, id4, id5};
        orderService.addProductToCart(id);
    }

    @GetMapping(path = "/get")
    public Collection<Product> get() {
        return orderService.getProductsInCart();
    }
}
