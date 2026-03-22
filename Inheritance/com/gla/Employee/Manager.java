package com.gla.Employee;

public class Manager extends Employee{
    int teamSize;
    public Manager(int id,String name,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    public void displayDeatils(){
        super.displayDetails();;
        System.out.println("TeamSize :-"+teamSize);
    }
}
