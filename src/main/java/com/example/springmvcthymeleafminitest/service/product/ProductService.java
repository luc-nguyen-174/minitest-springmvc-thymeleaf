package com.example.springmvcthymeleafminitest.service.product;

import com.example.springmvcthymeleafminitest.model.Product;
import com.example.springmvcthymeleafminitest.service.IGeneric;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ProductService implements IGeneric<Product> {
    private static final List<Product> products;
    private static int nextID = 0;


    /*
     * Tranh son mai: tr_sm
     * Tranh theu: tr_th
     * Tranh cat: tr_ct
     * */
    static {
        products = asList(
                new Product(nextID++, "tr_sm1", 50, 30, "son mai", "tranh son mai lang Ha Thai loai 1", 5000000),
                new Product(nextID++, "tr_sm2", 40, 28, "son mai", "tranh son mai lang Ha Thai loai 2", 2500000),
                new Product(nextID++, "tr_ct1", 70, 50, "cat", "Tranh cat cua nghe si Tri Duc", 10000000),
                new Product(nextID++, "tr_th1", 30, 25, "vai, chi", "tranh theu tay ", 1000000)
        );
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public Product findOne(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Product save(Product product) {
        return product.getId() == -1 ? persist(product) : merge(product);
    }

    @Override
    public void remove(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    @Override
    public boolean exists(int id) {
        return products.stream()
                .anyMatch(product -> product.getId() == id);
    }

    private Product persist(Product product) {
        Product clone = product.clone();
        clone.setId(nextID++);
        products.add(clone);
        return clone;
    }

    private Product merge(Product product) {
        Product origin = findOne(product.getId());
        origin.setProd_id(product.getProd_id());
        origin.setProd_height(product.getProd_height());
        origin.setProd_width(product.getProd_width());
        origin.setDesc(product.getDesc());
        origin.setMaterial(product.getMaterial());
        origin.setPrice(product.getPrice());
        return origin;
    }
}
