package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * Small interface: only pay() - Interface Segregation Principle (ISP).
 * High level modules depends on this abstraction(DIP).
 */

public interface PaymentMethod {
    void pay(Payment payment);
}
