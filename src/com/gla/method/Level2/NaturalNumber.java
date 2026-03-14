package com.gla.method.Level2;
import java.util.*;
public class NaturalNumber {
    static int sumnatural(int n){
        if(n == 1)
            return 1;
        return n + sumnatural(n-1);
    }
    static int  usingformula(int n){
        int formula=n*(n+1)/2;
        return formula;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(sumnatural(n));
        System.out.println(usingformula(n));
        if(sumnatural(n)==usingformula(n)){
            System.out.println("both are equal");
        }else{
            System.out.println("both ate different");
        }
    }
}
