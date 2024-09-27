package com.mploed.cohesion.procedural.classexample;

import java.util.regex.Pattern;

public class UserProcess {
    public void sendMailsToUsers() {
        User user = collectUserData();
        if(emailValid(user.getMail())) {
            sendEmail(user.getMail(), "Hello world!");
        } else {
            System.out.println("User email is not valid");
        }
    }

    private User collectUserData() {
        return new User("Michael Ploed", "michael.ploed@stopspammingthehelloutofme.com");
    }
    private boolean emailValid(String email) {
        Pattern emailPattern = Pattern.compile(
                "^[A-Za-z0-9+_.-]+@(.+)$"
        );
        return emailPattern.matcher(email).matches();
    }

    private void sendEmail(String email, String message) {
        System.out.println("Sending email to " + email + " with message: " + message);
    }
}
