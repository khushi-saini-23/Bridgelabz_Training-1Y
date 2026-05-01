package com.gla.OnlineFood;

public class NonVegItem extends Fooditem implements Discountable{
    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        double extraCharge = 50;
        return (getPrice() * getQuantity()) + extraCharge;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public void getDiscountDetails() {
        System.out.println("Non-Veg Discount: 5%");
    }
}