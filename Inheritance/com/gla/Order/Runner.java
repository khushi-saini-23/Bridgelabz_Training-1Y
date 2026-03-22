package com.gla.Order;

public class Runner {
    public static void main(String[] args){
        System.out.println("Order class");
        Order o1 = new Order(101,"23-3-2020","Order Placed");
        o1.displayDetails();


        System.out.println("-************************************************-");
        System.out.println("Shipped Order class");
        ShippedOrder s1 = new ShippedOrder(102,"24-5-2020","Shipped","ABC453");
        s1.displayDetails();


        System.out.println("-*************************************************-");
        System.out.println("Delivery order class");
        DeliveryOrder d1 = new DeliveryOrder(103,"22-4-2024","Order Delivered","30-4-2024");
        d1.displayDetails();
    }
}
