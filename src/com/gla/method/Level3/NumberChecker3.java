package com.gla.method.Level3;
import java.util.*;
public class NumberChecker3 {
    static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    static boolean neon(int n) {
        int sq = n * n;
        int s = 0;

        while (sq > 0) {
            s = s + sq % 10;
            sq = sq / 10;
        }

        return s == n;
    }
    static boolean spy(int n) {
        int s = 0;
        int p = 1;

        while (n > 0) {
            int d = n % 10;
            s = s + d;
            p = p * d;
            n = n / 10;
        }
        return s == p;
    }
    static boolean auto(int n) {
        int sq = n * n;
        int t = n;

        while (t > 0) {
            if (t % 10 != sq % 10) return false;
            t = t / 10;
            sq = sq / 10;
        }
        return true;
    }
    static boolean buzz(int n) {
        if (n % 7 == 0 || n % 10 == 7)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (prime(n))
            System.out.println("Prime number");
        else
            System.out.println("Not prime");

        if (neon(n))
            System.out.println("Neon number");
        else
            System.out.println("Not neon");

        if (spy(n))
            System.out.println("Spy number");
        else
            System.out.println("Not spy");

        if (auto(n))
            System.out.println("Automorphic number");
        else
            System.out.println("Not automorphic");

        if (buzz(n))
            System.out.println("Buzz number");
        else
            System.out.println("Not buzz");
    }
}
