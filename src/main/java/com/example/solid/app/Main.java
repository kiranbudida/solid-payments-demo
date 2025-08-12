package com.example.solid.app;

import com.example.solid.model.Payment;
import com.example.solid.service.*;
import com.example.solid.util.ReceiptPrinter;

public class Main {
    public static void main(String[] args) {
        Payment p1 = new Payment(150.0, "USD", "ref-cc-001");
        Payment p2 = new Payment(75.5, "INR", "ref-upi-123");

        PaymentValidator validator = new PaymentValidator();

        //Credit card (supports refunds)
        PaymentProcessor ccProcessor = new PaymentProcessor(new CreditCardPayment(), validator);
        ccProcessor.process(p1);

        //UPI (no refunds)
        PaymentProcessor upiProcessor = new PaymentProcessor(new UPIPayment(), validator);
        upiProcessor.process(p2);

        //Print receipt (SRP)
        ReceiptPrinter receiptPrinter = new ReceiptPrinter();
        receiptPrinter.print(p1);

        //Refund using RefundService (only pass refundable implementations)
        RefundService refundService = new RefundService(new CreditCardPayment());
        refundService.refund(p1);

        //Note: we cannot pass UPIPayment to RefundService because it doesn't implement RefundablePayment.
    }
}