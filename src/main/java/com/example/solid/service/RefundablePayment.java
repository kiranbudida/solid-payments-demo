package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * Optional capability: only payment methods that support refunds should implement this.
 * Keeps interfaces small and focused.
 */

public interface RefundablePayment {
    void refund(Payment payment);
}
