package com.gla.method.Level3;
import java.util.*;
public class NumberChecker2 {
    static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }
    static int[] digits(int n) {
        int c = count(n);
        int[] a = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            a[i] = n % 10;
            n = n / 10;
        }
        return a;
    }
    static int[] rev(int[] a) {
        int[] b = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }
        return b;
    }
    static boolean same(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    static boolean pal(int[] a) {
        int[] b = rev(a);
        return same(a, b);
    }
    static boolean duck(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = digits(n);
        int[] b = rev(a);
        System.out.println("Digit count: " + count(n));

        System.out.print("Digits: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nReversed: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        if (pal(a))
            System.out.println("\nPalindrome number");
        else
            System.out.println("\nNot Palindrome number");

        if (duck(a))
            System.out.println("Duck number");
        else
            System.out.println("Not Duck number");
    }
}
