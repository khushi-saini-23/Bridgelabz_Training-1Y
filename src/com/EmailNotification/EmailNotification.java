package com.EmailNotification;
import java.util.*;
public class EmailNotification {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "Khushi@gmail.com",
                "Purvi@gmail.com",
                "Jerry@gmail.com"
        );
        emails.forEach(email -> sendEmailNotification(email));
    }
    public static void sendEmailNotification(String email) {
        System.out.println("Send to this email to : " + email);
    }
}
