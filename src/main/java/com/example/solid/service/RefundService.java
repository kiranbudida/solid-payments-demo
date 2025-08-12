package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * Class dedicated to refunds. It depends on the small RefundablePayment interface.
 * If a method is not refundable, it simply won't be passed here.
 */

public class RefundService {
    private final RefundablePayment refundable;

    public RefundService(RefundablePayment refundable) {
        this.refundable = refundable;
    }

    public void refund(Payment payment) {
        refundable.refund(payment);
    }
}
