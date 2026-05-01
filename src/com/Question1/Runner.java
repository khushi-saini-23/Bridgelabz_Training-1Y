package com.Question1;

public class Runner {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(12);
        System.out.println("Integer:- " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Khushi Saini");
        System.out.println("String: " + strBox.get());

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(89.95);
        System.out.println("Double: " + doubleBox.get());
    }
}
