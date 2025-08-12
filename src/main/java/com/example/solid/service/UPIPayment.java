package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * Example of a payment method that does not support refunds.
 * It only implements PaymentMethod (ISP).
 */

public class UPIPayment implements PaymentMethod {
    @Override
    public void pay(Payment payment) {
        System.out.println("Processing UPI payment "+
                payment.getAmount() + " " + payment.getCurrency() +
                " (ref: " + payment.getReference() + ")");
    }
}
