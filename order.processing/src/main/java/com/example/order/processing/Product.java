package com.example.order.processing;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Product {
    private final String name;

    public Product(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Product name cannot be null");
        }
        this.name = name;
    }
}
