package com.gla.method.Level3;
import java.util.*;
public class NumberChecker4 {
    static int sumDiv(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s = s + i;
            }
        }
        return s;
    }
    static boolean perfect(int n) {
        return sumDiv(n) == n;
    }
    static boolean abundant(int n) {
        return sumDiv(n) > n;
    }
    static boolean deficient(int n) {
        return sumDiv(n) < n;
    }
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    static boolean strong(int n) {
        int t = n;
        int s = 0;
        while (t > 0) {
            int d = t % 10;
            s = s + fact(d);
            t = t / 10;
        }
        return s == n;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (perfect(n))
            System.out.println("Perfect number");
        else
            System.out.println("Not perfect");
        if (abundant(n))
            System.out.println("Abundant number");
        else
            System.out.println("Not abundant");
        if (deficient(n))
            System.out.println("Deficient number");
        else
            System.out.println("Not deficient");
        if (strong(n))
            System.out.println("Strong number");
        else
            System.out.println("Not strong");
    }
}
