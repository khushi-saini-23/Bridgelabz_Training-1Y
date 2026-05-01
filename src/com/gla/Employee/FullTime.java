package com.gla.Employee;

public class FullTime extends Employee {
    String department;

    public FullTime(int id, String name, double salary) {
        super(name, id, salary);
    }

    @Override
    public double salarycalculation(int hours, int rate) {
        return 0;
    }
}