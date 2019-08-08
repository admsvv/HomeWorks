package com.softserve.academy.task_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 10, i = 1, sum = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}