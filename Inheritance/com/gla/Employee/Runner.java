package com.gla.Employee;

public class Runner {
    public static void main(String[] args){
        System.out.println("Employee class");
        Employee e1 = new Employee("Khushi",101,1000000);
        e1.displayDetails();

        System.out.println("**************************************************************");
        System.out.println("Developer class");
        Developer d2 = new Developer("Ram",787656,9900000,"java");
        d2.displayDetails();

        System.out.println("****************************************************************");
        System.out.println("Intern class");
        Intern i1 = new Intern("Sai",2334544,780000000,110);
        i1.displayDetails();
    }
}
