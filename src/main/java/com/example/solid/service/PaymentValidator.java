package com.example.solid.service;

import com.example.solid.model.Payment;

/**
 * Single responsibility: validates payment objects.
 */

public class PaymentValidator {
    public boolean isValid(Payment p) {
        return p != null && p.getAmount() > 0
                && p.getCurrency() != null && !p.getCurrency().isBlank();
    }
}
