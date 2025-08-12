package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * High-level module that depends on abstractions (PaymentMethod) - DIP.
 * It is closed for modification when adding new PaymentMethod implementations - OCP
 * Any PaymentMethod can substitute here - LSP.
 */

public class PaymentProcessor {
    private final PaymentMethod method;
    private final PaymentValidator validator;

    public PaymentProcessor(PaymentMethod method, PaymentValidator validator) {
        this.method = method;
        this.validator = validator;
    }

    public void process(Payment payment) {
        if (!validator.isValid(payment)) {
            throw new IllegalArgumentException("Invalid payment");
        }
        method.pay(payment);
    }
}
