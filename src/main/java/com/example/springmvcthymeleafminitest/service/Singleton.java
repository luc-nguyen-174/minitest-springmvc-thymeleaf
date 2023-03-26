package com.example.springmvcthymeleafminitest.service;

import com.example.springmvcthymeleafminitest.model.Product;
import com.example.springmvcthymeleafminitest.service.product.ProductService;

public class Singleton {
    private static IGeneric<Product> instance;
    public static synchronized IGeneric<Product> getInstance() {
        if (instance == null) {
            instance = new ProductService();
        }
        return instance;
    }
}
