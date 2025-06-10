package com.alexisfirstspring.store;

import java.time.temporal.ValueRange;

public class OrderService {

    //this references any class that implements PaymentService
    private PaymentService paymentService;

    //constructor to pass in the specific payment method we want to use
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    //method that places an order and processes a payment of $10
    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
