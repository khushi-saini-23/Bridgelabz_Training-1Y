package com.gla.method.Level2;
import java.util.*;
public class UnitConvertor1 {
    public static double yardToFeet(double yards){
        double yards2feet = 3;
        return yards*yards2feet;
    }
    public static double feetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double meterToInches(double meters){
        double meters2inches = 39.3701;
        return meters*meters2inches;
    }
    public static double inchesToMeter(double inches){
        double inches2meters = 0.0254;
        return inches*inches2meters;
    }
    public static double inchesToCm(double cm ){
        double inches2cm = 2.54;
        return cm*inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the yards");
        double yards=sc.nextDouble();
        System.out.println("yards : " +UnitConvertor1.yardToFeet(yards));


        System.out.println("Enter the feet : ");
        double feet=sc.nextDouble();
        System.out.println("feet : " +UnitConvertor1.feetToYards(feet));


        System.out.println("Enter the meters : ");
        double meters=sc.nextDouble();
        System.out.println("meters : " +UnitConvertor1.meterToInches(meters));


        System.out.println("Enter the inches : ");
        double inches=sc.nextDouble();
        System.out.println("inches : " +UnitConvertor1.inchesToMeter(inches));



        System.out.println("Enter the cm : ");
        double cm=sc.nextDouble();
        System.out.println("cm : " +UnitConvertor1.inchesToCm(cm));
    }
}
