package com.softserve.academy.homework_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double radius;
        Scanner myScan = new Scanner(System.in);
        System.out.println("Введіть радіус клумби (у метрах) . . . ");

        radius = myScan.nextDouble();
        double perimeter = Math.PI * 2 * radius;
        System.out.printf("По периметру клумба має %.2f", perimeter);
        System.out.println(" м");

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Площа клумби %.2f", area);
        System.out.println(" м" + '\u00B2');

    }
}
