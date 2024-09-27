package com.mploed.cohesion.procedural.packageexample;

public class UserProcess {
    public static void main(String[] args) {
        User user = new UserDataCollector().collectUserData();
        if(EmailValidator.emailValid(user.getMail())) {
            EmailSender.sendEmail(user.getMail(), "Hello world!");
        } else {
            System.out.println("User email is not valid");
        }
    }
}
