package com.gla.Ecommerce;

public class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculatediscount(double price) {
        return getPrice() * 0.05;
    }
}
