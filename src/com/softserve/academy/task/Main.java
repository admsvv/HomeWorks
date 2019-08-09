package com.softserve.academy.task;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.setName();
        person1.setBirthYear();
        person1.info();
        int numOfObj = Person.count;
        System.out.println("We have created: " + numOfObj + " Person's objects");
    }
}