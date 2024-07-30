package org.example.Adapter;

import org.example.Adaptee.Developer;
import org.example.Target.Customer;

public class BusinessAnalyst implements Customer {
    private Developer developer;

    public BusinessAnalyst(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Reading customer message ...");
        System.out.println(message);
        String info = this.translate(message);
        System.out.println("Sending info ...");
        developer.receiveMessage(info);
    }

    private String translate(String message) {
        return "Create Zoom";
    }
}
