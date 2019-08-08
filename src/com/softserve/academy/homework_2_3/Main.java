package com.softserve.academy.homework_2_3;

//import java.util.Arrays;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Random random = new Random();
//
//        int lengthArray = random.nextInt(10) + 1;
//        int[] a = new int[lengthArray];
//
//        for (int i = 0; i < a.length; i++) a[i] = random.nextInt(21) - 10;
//        System.out.println("Наш массив: " + Arrays.toString(a));

        double[] a = {1, 7, 4, -8, 5, 11, 27, 10, 2, 3};

        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0) count++;
        }

        System.out.print("ВІДПОВІДЬ: Наш масив має " + count + " від'ємних числа(-ел);");
    }
}
