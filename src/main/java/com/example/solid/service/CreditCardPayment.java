package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * Concrete payment method (OCP: can add many of these without changing processor)
 */

public class CreditCardPayment implements PaymentMethod, RefundablePayment{

    @Override
    public void pay(Payment payment) {
        System.out.println("Charging credit card: "+
                payment.getAmount() + " " +
                payment.getCurrency());
    }

    @Override
    public void refund(Payment payment) {
        System.out.println("Refunding credit card: "+ payment.getReference());
    }
}
