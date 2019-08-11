package com.softserve.academy.homework.two;

abstract class Person {

    String name;

    abstract void print();

    Person(String name) {
        this.name = name;
    }
}