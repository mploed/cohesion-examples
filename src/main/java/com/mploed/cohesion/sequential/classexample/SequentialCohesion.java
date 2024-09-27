package com.mploed.cohesion.sequential.classexample;

public class SequentialCohesion {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Item 1", 9.99));
        shoppingCart.addItem(new Item("Item 2", 4.99));
        shoppingCart.addItem(new Item("Item 3", 1.99));

        Payment payment = processPayment(shoppingCart);
        if(payment.getStatus() == PaymentStatus.PAID) {
            Invoice invoice = generateInvoice(payment);
            System.out.println("Invoice generated: " + invoice);
        } else {
            System.out.println("Payment failed");
        }
    }

    public static Invoice generateInvoice(Payment payment) {
        Invoice invoice = new Invoice(payment.getAmount());
        return invoice;
    }

    public static Payment processPayment(ShoppingCart shoppingCart) {
        Payment payment = new Payment();
        shoppingCart.getItems().forEach(item -> {
            payment.addAmount(item.getPrice());
        });
        payment.performPayment();
        return payment;
    }
}
