package com.gla.Employee;

public class Runner {
    public static void main(String[] args) {

        FullTime e1 = new FullTime(1, "Rahul", 50000);
        PartTime e2 = new PartTime(2, "Anjali", 5, 500);

        System.out.println("Full Time Employee:");
        e1.displayinfo();

        System.out.println("\nPart Time Employee:");
        e2.displayinfo();

    }
}
