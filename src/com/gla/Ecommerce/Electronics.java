package com.gla.Ecommerce;

public class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculatediscount(double price) {
        return getPrice() * 0.10;
    }


    @Override
    public double calculateTax() {
        return getPrice() * 0.18;

    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax : 18%");

    }
}