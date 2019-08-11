package com.softserve.academy.homework.two;

public class Student extends Person {

    Student(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I'm a Student " + "My name is " + name);
    }
}