package com.softserve.academy.task_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int a = 30, b = 15, c, d, e, f;
//        c = a + b;
//        d = a - b;
//        e = a * b;
//        f = a / b;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
        int a, b, c, x;
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please, enter first number . . . ");
        a = myScan.nextInt();
        System.out.println("Please, enter second number . . . ");
        b = myScan.nextInt();
        c = a + b;
        System.out.println("a + b = " + c);
        c = a - b;
        System.out.println("a - b = " + c);
        c = a * b;
        System.out.println("a * b = " + c);
        c = a / b;
        System.out.println("a / b = " + c);
    }
}
