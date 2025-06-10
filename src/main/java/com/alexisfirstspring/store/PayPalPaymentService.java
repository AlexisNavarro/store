package com.alexisfirstspring.store;

//This class will now reference the payment service class
//This class can be used interchangeably with any other payment service
//allowing for flexibility and adherence to open/closed principle
public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYPAL");
        System.out.println("Amount: " + amount);
    }
}
