package com.gla.method.Level1;
import java.util.*;
public class QuoRem {
    public static void remQuo(int a,int b){
        if(b==0){
            System.out.println("plz enter the non zero number");
            return;
        }
        int div=a/b;
        int mod=a%b;
        System.out.println(div);
        System.out.println(mod);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int a=sc.nextInt();
        System.out.println("enter the deno");
        int b=sc.nextInt();
        remQuo(a,b);
    }
}
