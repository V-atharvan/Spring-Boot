package com.StartSpring;

public class OrderService {


    private PaymentService paymentService;

    public  OrderService(PaymentService service) {
        this.paymentService = paymentService;
    }



    public void placeOrder() {
        System.out.println("Order Placed !!");
    }
}
