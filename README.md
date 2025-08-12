# Payment Processing System – SOLID Principles in Java

This project demonstrates **all 5 SOLID principles** in one coherent Java example using a simple payment processing system.

---

## **S — Single Responsibility Principle (SRP)**  
Each class has **only one reason to change**:

- **Payment** → Holds payment data only.
- **PaymentValidator** → Validates payment details only.
- **ReceiptPrinter** → Prints receipts only.
- **RefundService** → Handles refunds only.

---

## **O — Open/Closed Principle (OCP)**  
Classes are **open for extension but closed for modification**:

- **PaymentProcessor** works with the `PaymentMethod` interface.  
- To add a new payment method (e.g., `CryptoPayment`), create a new class implementing `PaymentMethod` — no changes to `PaymentProcessor` are needed.

---

## **L — Liskov Substitution Principle (LSP)**  
Subtypes must be **substitutable** for their base type:

- Any `PaymentMethod` implementation can be passed to `PaymentProcessor`.  
- `CreditCardPayment` or `UPIPayment` can be used without changing how `PaymentProcessor` works.

---

## **I — Interface Segregation Principle (ISP)**  
No class should be forced to implement interfaces it does not use:

- `PaymentMethod` → Has only `pay()`.
- `RefundablePayment` → Has only `refund()`.
- `UPIPayment` implements only `pay()` (no refund).
- `CreditCardPayment` implements both `pay()` and `refund()`.

---

## **D — Dependency Inversion Principle (DIP)**  
High-level modules depend on abstractions, not concrete implementations:

- **PaymentProcessor** and **RefundService** depend on interfaces (`PaymentMethod`, `RefundablePayment`) instead of concrete classes.
- Concrete implementations are injected using **constructor injection**.

---
