package com.softserve.academy.homework_2;

public class Main {
    public static void main(String[] args) {

        double[] myArray = {1, 7, 4, -8, 5, 11, 27, 10, 2, 3};

        // Вивід елементів масиву на екран з позитивним індексом
        System.out.println("Елементи масиву myArray з позитивним індексом: ");
        for (int i = 0; i < myArray.length; i++) {
            if (i%2 == 0) {
                System.out.print("індекс " + i + " = " + myArray [i] + ", ");
            }
        }
        // Вивід елементів масиву на екран з негативним індексом
        System.out.println("\nЕлементи масиву myArray з негативним індексом: ");
        for (int i = 1; i < myArray.length; i++) {
            if (i%2 != 0) {
                System.out.print("індекс " + i + " = " + myArray[i] + ", ");
            }
        }
    }
}
