package com.gla.method.Level3;
import java.util.*;
public class NumberChecker1 {
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
    static int sum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
        }
        return s;
    }

    static int squareSum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s = s + (int)Math.pow(a[i], 2);
        }
        return s;
    }

    static boolean harshad(int n, int[] a) {
        int s = sum(a);
        return n % s == 0;
    }

    static void freq(int[] a) {
        int[][] f = new int[10][2];

        for (int i = 0; i < 10; i++) {
            f[i][0] = i;
        }

        for (int i = 0; i < a.length; i++) {
            f[a[i]][1]++;
        }

        for (int i = 0; i < 10; i++) {
            if (f[i][1] > 0) {
                System.out.println(f[i][0] + " -> " + f[i][1]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = digits(n);
        System.out.println("Digit count: " + count(n));
        System.out.println("Sum of digits: " + sum(a));
        System.out.println("Sum of squares: " + squareSum(a));
        if (harshad(n, a))
            System.out.println("Harshad number");
        else
            System.out.println("Not Harshad number");
        System.out.println("Digit Frequency:");
        freq(a);
    }
}
