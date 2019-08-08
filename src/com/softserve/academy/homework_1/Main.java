package com.softserve.academy.homework_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int year = 0000;
//        boolean isLeap;
//
//        if (year % 4 != 0) {
//            isLeap = false;
//        }
//        else {
//            if (year % 100 != 0) {
//                isLeap = true;
//            }
//            else {
//                if (year % 400 == 0) {
//                    isLeap = true;
//                }
//                else {
//                    isLeap = false;
//                }
//            }
//        }
//        System.out.println(isLeap);
//    }
//}

        int year = 2019;
        boolean isLeap;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        }
        else {
            isLeap = false;
        }
        System.out.println(isLeap);
    }
}
