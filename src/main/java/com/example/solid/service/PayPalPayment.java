package com.example.solid.service;

import com.example.solid.model.Payment;

public class PayPalPayment implements PaymentMethod, RefundablePayment{
    @Override
    public void pay(Payment payment) {
        System.out.println("Processing PayPal payment: "+
                payment.getAmount() + " " + payment.getCurrency());
    }

    @Override
    public void refund(Payment payment) {
        System.out.println("Refunding PayPal payment: "+ payment.getReference());
    }
}
