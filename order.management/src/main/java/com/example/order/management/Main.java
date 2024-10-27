package com.example.order.management;

import com.example.order.processing.Clothing;
import com.example.order.processing.Electronics;
import com.example.order.storage.OrderStorage;

public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        OrderStorage storage = new OrderStorage();

        Clothing clothing = Clothing.builder().name("T-Shirt").build();
        Electronics electronics = Electronics.builder().name("Laptop").build();

        manager.processOrderInThread(clothing);
        manager.processOrderInThread(electronics);

        storage.addOrder(clothing);
        storage.addOrder(electronics);

        System.out.println("All orders processed and stored.");
    }
}
