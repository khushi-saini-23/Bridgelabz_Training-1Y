package com.gla.Ecommerce;

public class Runner {
    public static void main(String[] args) {


        Electronics e = new Electronics(1, "Laptop", 50000);
        e.displayDetails();
        double total1 = e.getPrice();
        double discount1 = e.calculateDiscount();
        double tax1 = e.calculateTax();

        System.out.println("Discount: " + discount1);
        System.out.println("Tax: " + tax1);
        System.out.println("Final Price: " + (total1 + tax1 - discount1));
        e.getTaxDetails();

        System.out.println("------------------------------------------------");


        Clothing c = new Clothing(2, "Shirt", 2000);
        c.displayDetails();
        double total2 = c.getPrice();
        double discount2 = c.calculateDiscount();
        double tax2 = c.calculateTax();

        System.out.println("Discount: " + discount2);
        System.out.println("Tax: " + tax2);
        System.out.println("Final Price: " + (total2 + tax2 - discount2));
        c.getTaxDetails();

        System.out.println("-----------------------------------------------");


        Groceries g = new Groceries(3, "Rice", 1000);
        g.displayDetails();
        double total3 = g.getPrice();
        double discount3 = g.calculateDiscount();

        System.out.println("Discount: " + discount3);
        System.out.println("Tax: 0");
        System.out.println("Final Price: " + (total3 - discount3));
    }
}
