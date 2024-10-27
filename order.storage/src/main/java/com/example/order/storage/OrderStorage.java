package com.example.order.storage;

import com.example.order.processing.Product;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OrderStorage {
    private final List<Product> orders = new ArrayList<>();

    public void addOrder(Product product) {
        orders.add(product);
        System.out.println("Order added: " + product.getName());
    }

}
