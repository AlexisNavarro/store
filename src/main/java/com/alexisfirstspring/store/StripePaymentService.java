package com.alexisfirstspring.store;


//This class will now reference the payment service class
//This class can be used interchangeably with any other payment service
//allowing for flexibility and adherence to open/closed principle
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
