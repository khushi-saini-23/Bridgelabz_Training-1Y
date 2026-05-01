package com.gla.Employee;

public class PartTime extends Employee {
    int hoursWorked;
    double hourlyRate;
    String department;

    public PartTime(int id, String name, double baseSalary, int hoursWorked) {
        super(name, id, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    @Override
    public double salarycalculation(int hours, int rate) {
        return 0;
    }
}
