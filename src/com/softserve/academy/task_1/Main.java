package com.softserve.academy.task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String evenOdd, posNeg;
        System.out.println("Введіть значення змінної \"m\" =>> ");
        int m = scanner.nextInt();

        if (m > 0) {
            n = 1;
        }
        else if (m == 0) {
            n = 0;
        }
        else {
            n = -1;
        }
        System.out.println("n = " + n);

        evenOdd = (m % 2 ==0) ? "m є парним числом" : "m є непарним числом";
        System.out.println(evenOdd);

        posNeg = (m < 0) ? "m є негативним числом" : "m є позитивним числом";
        System.out.println(posNeg);
        scanner.close();

    }
}
