package com.alexisfirstspring.store;

//Interface for payments done which will be called upon Stripe or PayPal
public interface PaymentService {
    void processPayment(double amount);
}
