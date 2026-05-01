package com.gla.OnlineFood;

public class Runner {
    public static void main(String[] args) {


        VegItem v = new VegItem("Paneer", 200, 2);
        v.getItemDetails();
        double total1 = v.calculateTotalPrice();
        double discount1 = v.applyDiscount();

        System.out.println("Total Price: " + total1);
        System.out.println("Discount: " + discount1);
        System.out.println("Final Price: " + (total1 - discount1));
        v.getDiscountDetails();

        System.out.println("----------------------");


        NonVegItem n = new NonVegItem("Chicken", 300, 2);
        n.getItemDetails();
        double total2 = n.calculateTotalPrice();
        double discount2 = n.applyDiscount();

        System.out.println("Total Price: " + total2);
        System.out.println("Discount: " + discount2);
        System.out.println("Final Price: " + (total2 - discount2));
        n.getDiscountDetails();
    }
}
