package com.example.order.processing;

import java.util.ArrayList;
import java.util.List;

public class OrderManagement {
    public static void main(String[] args) {
        List<OrderProcessor<Product>> orderProcessors = new ArrayList<>();

        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");

        orderProcessors.add(new OrderProcessor<>(product1));
        orderProcessors.add(new OrderProcessor<>(product2));

        for (OrderProcessor<Product> orderProcessor : orderProcessors) {
            System.out.println("Order added: " + orderProcessor.product().getName());
        }

        for (OrderProcessor<Product> orderProcessor : orderProcessors) {
            orderProcessor.process();
        }

        System.out.println("All orders processed and stored.");
    }
}
