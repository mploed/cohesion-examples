package com.mploed.cohesion.sequential.packageexample;

public class PaymentProcess {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Item 1", 19.99));
        shoppingCart.addItem(new Item("Item 2", 29.99));
        shoppingCart.addItem(new Item("Item 3", 39.99));

        Payment payment = PaymentProcessor.processPayment(shoppingCart);

        if(payment.getStatus() == PaymentStatus.PAID) {
            Invoice invoice = InvoiceGenerator.generateInvoice(payment);
            System.out.println("Invoice generated: " + invoice);
        } else {
            System.out.println("Payment failed");
        }
    }
}

