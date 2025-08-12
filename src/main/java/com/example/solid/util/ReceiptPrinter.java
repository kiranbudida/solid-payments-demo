package com.example.solid.util;

import com.example.solid.model.Payment;

/**
 * Single responsibility: printing/formatting receipts
 */

public class ReceiptPrinter {
    public void print(Payment payment) {
        System.out.println("---- RECEIPT ----");
        System.out.println("Ref: " + payment.getReference());
        System.out.println("Amount: "+ payment.getAmount() + " " + payment.getCurrency());
        System.out.println("-----------------");
    }
}
