package com.example.springmvcthymeleafminitest.service;

import com.example.springmvcthymeleafminitest.model.Product;

import java.util.List;

public interface IGeneric<T> {
    List<T> findAll();

    T findOne(int id);

    Product save(T generic);

    void remove(int id);

    void edit(int id, T generic);

    boolean exists(int id);
}
