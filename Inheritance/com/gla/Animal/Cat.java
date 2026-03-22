package com.gla.Animal;

public class Cat extends Animal{
    String makeSound;
    public Cat(String name, int age, String makeSound){
        super(name,age);
        this.makeSound=makeSound;
    }
    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Make sound: "+makeSound);
    }

}
