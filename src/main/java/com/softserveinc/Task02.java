package com.softserveinc;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
    Write a program that displays a table of temperature correspondence in degrees Celsius and Fahrenheit (F°=9/5·C° + 32).
    The user should input the temperature range in degrees Celsius and the step.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    t1 >>> 0
    t2 >>> 10
    dt >>> 1
    -----------------
    C       F

    -----------------
    0.00    32.00
    1.00    33.80
    2.00    35.60
    3.00    37.40
    4.00    39.20
    5.00    41.00
    6.00    42.80
    7.00    44.60
    8.00    46.40
    9.00    48.20
    10.00    50.00
    -----------------
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("t1 >>> ");
        int t1 = scanner.nextInt();

        System.out.print("t2 >>> ");
        int t2 = scanner.nextInt();

        System.out.print("dt >>> ");
        int dt = scanner.nextInt();

        System.out.print("-----------------\n" + "C       F\n" + "-----------------\n");

        int n = ((t2 - t1) / dt) + 1;
        double[] Celsius = new double[n];

        int i = t1;
        int b = 0;
        while (i <= t2) {
            Celsius[b] = i;
            i = i + dt;
            b++;
        }

        int c = 0;
        while (c < Celsius.length) {
            System.out.printf("%.2f    ", Celsius[c]);
            System.out.printf("%.2f\n", (9.00 / 5.00 * Celsius[c]) + 32.00);
            c++;
        }

        System.out.println("-----------------");

    }
}
