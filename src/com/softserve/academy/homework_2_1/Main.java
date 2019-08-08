package com.softserve.academy.homework_2_1;

public class Main {
    public static void main(String[] args) {

        double[] myArray = {1, 7, 4, -8, 5, 11, 27, 10, 2, 3};

        double max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) max = myArray[i];
        }
        System.out.println("Найбільший елемент: " + max);
    }
}

