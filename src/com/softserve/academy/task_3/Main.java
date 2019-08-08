package com.softserve.academy.task_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How are you?");

        String phrase1 = sc.nextLine();
        System.out.println(phrase1);
        sc.close();
    }
}
