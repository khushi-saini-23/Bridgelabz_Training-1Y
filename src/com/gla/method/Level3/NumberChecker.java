package com.gla.method.Level3;
import java.util.*;
public class NumberChecker {
    public static int count(int n) {
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
    public static int[] digits(int n) {
        int c = count(n);
        int[] a = new int[c];
        for (int i = c - 1; i >= 0; i--) {
            a[i] = n % 10;
            n = n / 10;
        }
        return a;
    }
    public static boolean duck(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean arm(int n, int[] a) {
        int p = a.length;
        int s = 0;

        for (int i = 0; i < a.length; i++) {
            int r = 1;
            for (int j = 0; j < p; j++) {
                r = r * a[i];
            }
            s = s + r;
        }

        if (s == n) {
            return true;
        }
        return false;
    }
    public static void large(int[] a) {
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > f) {
                s = f;
                f = a[i];
            } else if (a[i] > s && a[i] != f) {
                s = a[i];
            }
        }
        System.out.println("Largest: " + f);
        System.out.println("Second Largest: " + s);
    }

    public static void small(int[] a) {
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < f) {
                s = f;
                f = a[i];
            } else if (a[i] < s && a[i] != f) {
                s = a[i];
            }
        }

        System.out.println("Smallest: " + f);
        System.out.println("Second Smallest: " + s);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = count(n);
        int[] a = digits(n);
        System.out.println("Digit count: " + c);
        System.out.print("Digits: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        if (duck(a)) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not Duck number");
        }
        if (arm(n, a)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");}

        large(a);
        small(a);
    }
}
