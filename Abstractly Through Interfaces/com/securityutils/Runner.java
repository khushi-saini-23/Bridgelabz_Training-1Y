package com.securityutils;

public class Runner {
    public static void main(String args[]) {
        String pass = "Khushi@123";
        if (Security.isStrongPassword(pass)) {
            System.out.println("Strong");

        } else {
            System.out.println("Weak");
        }
    }
}
