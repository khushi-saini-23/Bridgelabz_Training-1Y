package com.gla.Employee;

public class Developer extends Employee {
    String programmingLanguage;
    public Developer(String name,int id,int salary,String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language :-"+programmingLanguage);


    }
}
