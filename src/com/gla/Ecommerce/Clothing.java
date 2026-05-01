package com.gla.Ecommerce;

public class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculatediscount(double price) {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax : 5%");
    }
}
