package com.example.solid.model;

/**
 * Immutable payment data object
 * (SRP: holds payment data only)
 */

public final class Payment {
    private final double amount;
    private final String currency;
    private final String reference;

    public Payment(double amount, String currency, String reference) {
        this.amount = amount;
        this.currency = currency;
        this.reference = reference;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getReference() {
        return reference;
    }
}
