package com.softserve.academy.homework_2_2;

public class Main {
    public static void main(String[] args) {

        double[] myArray = {1, 7, 4, -8, 5, 11, 27, 10, 2, 3};

        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        System.out.println("Сума чисел масиву: " + total);
    }
}