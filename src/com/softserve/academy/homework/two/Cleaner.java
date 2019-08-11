package com.softserve.academy.homework.two;

public class Cleaner extends Staff {

    Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a Cleaner...");
    }

    @Override
    public void salary() {
        System.out.println("Cleaner: My salary is 200$/per month...");
    }
}