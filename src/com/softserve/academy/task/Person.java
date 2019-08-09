package com.softserve.academy.task;

import java.time.LocalDate;

public class Person {

    private LocalDate date = LocalDate.now();
    static int count = 0;
    private String name;
    private int birthYear;

    Person(){
        count++;
    }
    public Person(String name,int birthYear) {
        this.name=name;
        this.birthYear=birthYear;
        count++;
    }

    void setBirthYear() {
        this.birthYear= 1975;
    }
    public int getBirthYear(int i){
        return birthYear;
    }

    void setName() {
        this.name = "Volodymyr";
    }

    public String getName() {
        return name;
    }

    private int currAge() {
        return date.getYear() - birthYear;
    }

    void info() {
        if (currAge() < 0) {
            System.out.println("Please, enter correct value of birthYear");
        } else if (currAge() == 0) {
            System.out.println("The " + name + " is less then one year");
        } else {
            System.out.println("Person's name: " + name + " and he/she is " + currAge());
        }
    }
}