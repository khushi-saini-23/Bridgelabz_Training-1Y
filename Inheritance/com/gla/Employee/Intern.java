package com.gla.Employee;

public class Intern extends Employee {
    int duration;

    public Intern(String name,int id,int salary,int duration){
        super(name, id, salary);
        this.duration=duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Duration :-"+duration);
    }
}
