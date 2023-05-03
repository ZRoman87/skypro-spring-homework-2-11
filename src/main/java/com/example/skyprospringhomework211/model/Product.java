package com.example.skyprospringhomework211.model;

public class Product {

    private final int id;

    public Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                '}';
    }
}
