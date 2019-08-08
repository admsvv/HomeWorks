package com.softserve.academy.homework_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.print("What is your name? =>> ");
        String name = myScan.next();
        System.out.print("How old are you? =>> ");
        String age = myScan.next();
        System.out.print("Your name is "+name +" and you are "+age);
    }
}
