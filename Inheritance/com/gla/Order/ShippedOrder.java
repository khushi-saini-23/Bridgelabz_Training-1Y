package com.gla.Order;

public class ShippedOrder extends Order{
    String trackingNumber;
    public ShippedOrder(int orderId,String orderDate,String  status,String trackingNumber) {
        super(orderId,orderDate,status);
        this.trackingNumber=trackingNumber;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tracking Number : "+trackingNumber);
    }
}
