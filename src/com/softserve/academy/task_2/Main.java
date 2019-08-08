package com.softserve.academy.task_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число:");

        int number = sc.nextInt();
        String text=number%2==0?"парне":"непарне";
        System.out.println ("Ви ввели  "+text+"  число!");
    }
}

//import javax.swing.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int number = Integer.parseInt(JOptionPane.showInputDialog("Введіть число:"));
//        String text=number%2==0?"парне":"непарне";
//        JOptionPane.showMessageDialog (      null, "Ви ввели  "+text+"  число!");
//    }
//}
