package com.softserve.academy.task_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        double number;
//        number = 112.8;
//        if (number < 0.0) {
//            System.out.println(number + " негативне число.");
//        }
//        else if ( number > 0.0) {
//            System.out.println(number + " позитивне число.");
//        }
//        else {
//              System.out.println(number + " 0.");
//        }

        Scanner input = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Число дорівнює нулю.");
        } else if (number > 0) {
            System.out.println("Позитивне число.");
        } else {
            System.out.println("Негативне число.");
        }
    }
}