package com.softserve.academy.homework.two;

public class Teacher extends Staff {

    Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a Teacher!");
    }

    @Override
    void salary() {
        System.out.println("Teacher: My salary is 1000$/per month!");
    }
}