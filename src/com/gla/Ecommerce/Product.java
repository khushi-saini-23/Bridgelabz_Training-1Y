package com.gla.Ecommerce;

public abstract class Product {
    int productId;
    String name;
    double price;

    public  Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculatediscount(double price);

    public void displayDetails() {
        System.out.println("Name :-" + name);
        System.out.println("productId :- " + productId);
        System.out.println("Price :- " + price);
    }
    public double calculateDiscount(){
        System.out.println("Price : "+ price);
        return 0;
    }
}
