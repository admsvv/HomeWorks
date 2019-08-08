package com.softserve.academy.task_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        int i = 0;
//
//        for (int j = 1; j <= 5; j++) {
//            if (j == 1 || j == 5) {
//                i = 4;
//            } else {
//                i = 1;
//            }
//            for (int x = 0; x < i; x++) {
//                System.out.print("**");
//            }
//            System.out.println();

//        }
//    }
//}


//        int n = 4;
//        int noOfStars = 1;
//
//        for (int rows = 1; rows <= n; rows++) {
//            // line of stars
//            for (int stCount = 1; stCount <= noOfStars; stCount++)
//                System.out.print("*");
//
//            // Next line
//            System.out.println();
//
//            noOfStars++;
//        }
//    }
//}