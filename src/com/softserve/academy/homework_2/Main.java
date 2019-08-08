package com.softserve.academy.homework_2;

public class Main {

    public static void main(String[] args) {
        int odd = 1; int noofspaces=3;
        for(int i=1;i<=4;i++) {
            int k=0;
            for(int j=1;j<=noofspaces;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=odd;j++) {
                System.out.print("*");
            }
            System.out.println();
            odd=odd+2;
            noofspaces=noofspaces-1;
        }
    }
}

//    int n = 3;
//    int noOfSpaces = n-1;
//    int noOfStars = 1;
//
//        for (int rows = 1; rows <= n; rows++) {
//            // Line of spaces
//            for (int spCount = 1; spCount <= noOfSpaces; spCount++)
//                System.out.print(" ");
//            // line of stars
//            for (int stCount = 1; stCount <= noOfStars; stCount++)
//                System.out.print("*");
//            // Next line
//            System.out.println();
//            noOfSpaces--; noOfStars +=2;
//        }
//    }
//}
