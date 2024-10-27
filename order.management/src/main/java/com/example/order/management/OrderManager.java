package com.example.order.management;

import com.example.order.processing.OrderProcessor;
import com.example.order.processing.Product;

public class OrderManager {
    public <T extends Product> void processOrderInThread(T product) {
        Runnable orderTask = () -> {
            OrderProcessor<T> processor = new OrderProcessor<>(product);
            processor.process();
            System.out.println("Processed by thread: " + Thread.currentThread().getName());
        };
        new Thread(orderTask).start();
    }
}
