package com.softserve.academy.homework.two;

abstract class Staff extends Person {

    abstract void salary();

    Staff(String name) {
        super(name);
    }
}