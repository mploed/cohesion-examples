package com.mploed.cohesion.procedural.packageexample;

public class EmailSender {
    public static void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
    }
}
