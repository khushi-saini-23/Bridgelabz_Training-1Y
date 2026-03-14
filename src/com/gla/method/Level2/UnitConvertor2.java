package com.gla.method.Level2;
import java.util.*;
public class UnitConvertor2 {
    public static double farhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit*farhenheit2celsius;
    }
    public static double celsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius*celsius2farhenheit;
    }
    public static double poundsToKilograms(double pounds){
        double pounds2kilograms=0.453592;
        return pounds*pounds2kilograms;
    }
    public static double kilogramsToPounds(double kilograms){
        double kilograms2pounds = 2.20462;
        return kilograms*kilograms2pounds;
    }
    public static double gallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
        return gallons*gallons2liters;
    }
    public static double litersToGallons(double liters){
        double liters2gallons = 0.264172;
        return liters*liters2gallons;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the farhenheit : ");
        double farhenheit=sc.nextDouble();
        System.out.println("farhenheit : " +UnitConvertor2.farhenheitToCelsius(farhenheit));


        System.out.println("Enter the celsius : ");
        double celsius=sc.nextDouble();
        System.out.println("celsius : " +UnitConvertor2.celsiusToFarhenheit(celsius));


        System.out.println("Enter the pounds : ");
        double pounds=sc.nextDouble();
        System.out.println("pounds : " +UnitConvertor2.poundsToKilograms(pounds));


        System.out.println("Enter the kilograms : ");
        double kilograms=sc.nextDouble();
        System.out.println("kilograms : " +UnitConvertor2.kilogramsToPounds(kilograms));


        System.out.println("Enter the gallons : ");
        double gallons=sc.nextDouble();
        System.out.println("gallons : " +UnitConvertor2.gallonsToLiters(gallons));


        System.out.println("Enter the liters : ");
        double liters=sc.nextDouble();
        System.out.println("liters : " +UnitConvertor2.litersToGallons(liters));
    }
}
