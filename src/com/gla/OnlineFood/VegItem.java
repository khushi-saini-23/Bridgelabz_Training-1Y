package com.gla.OnlineFood;

public class VegItem extends Fooditem implements Discountable{
    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public void getDiscountDetails() {
        System.out.println("Veg Discount: 10%");
    }
}