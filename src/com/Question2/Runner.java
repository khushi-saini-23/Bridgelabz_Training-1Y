package com.Question2;

public class Runner {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Khushi", 37);

        System.out.println("Name of the Student: " + student.getFirst());
        System.out.println("Roll No. of the Student : " + student.getSecond());
    }
}
