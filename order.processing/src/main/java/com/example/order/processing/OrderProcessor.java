package com.example.order.processing;

public record OrderProcessor<T extends Product>(T product) {
    public void process() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Order for " + product.getName() + " processed by " + threadName);
    }
}

