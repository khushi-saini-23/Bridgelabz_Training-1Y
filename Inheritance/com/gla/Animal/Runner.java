package com.gla.Animal;

public class Runner {
    static void main(String[] args) {
        System.out.println("Animal class");
        Animal a1=new Animal("tiger",4);
        a1.displayDetail();

        System.out.println("*****************************************************");
        System.out.println("Dog class");
        Dog d1=new Dog("jerry",5,"bark bark");
        d1.displayDetail();

        System.out.println("*****************************************************");
        System.out.println("Cat class");
        Cat c1=new Cat("Tom",6,"Meow Meow");
        c1.displayDetail();

        System.out.println("*****************************************************");
        System.out.println("Birds class");
        Birds b1=new Birds("piko",9,"chrip chrip");
        b1.displayDetail();
    }
}
