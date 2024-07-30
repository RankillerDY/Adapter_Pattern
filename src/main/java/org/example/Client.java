package org.example;

import org.example.Adaptee.Developer;
import org.example.Adapter.BusinessAnalyst;
import org.example.Target.Customer;

public class Client {
    public static void main(String[] args) {
        Customer customer = new BusinessAnalyst(new Developer());
        customer.sendMessage("I want to work from home");
    }
}