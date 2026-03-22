package com.gla.Order;

public class Order {
    int orderId;
    String orderDate;
    String status;
    public Order(int orderId,String orderDate,String status){
        this.orderId=orderId;
        this.orderDate=orderDate;
        this.status=status;
    }
    public void displayDetails(){
        System.out.println("Order Id : "+orderId);
        System.out.println("Order Date : "+orderDate);
        System.out.println("Status : "+status);
    }
}
