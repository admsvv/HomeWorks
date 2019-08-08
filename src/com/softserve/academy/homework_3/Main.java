package com.softserve.academy.homework_3;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

        int sum = 0, j = 0, m = 1;
        System.out.print("Input the number of terms: ");

        int n = sc.nextInt();
        System.out.println("Expected Output:");
        for (int i = 1; i <= n; i++) {
            m = m + j;
            System.out.print(m);
            j = (int) pow(10, i);
            sum = sum + m;
            System.out.print(" + ");
        }
        System.out.println();
        System.out.println("The Sum is: " + sum);
    }
}