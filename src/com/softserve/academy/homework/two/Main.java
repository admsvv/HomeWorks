package com.softserve.academy.homework.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Student("Volodymyr"));
        peopleList.add(new Student("Igor"));
        peopleList.add(new Student("Andriy"));
        peopleList.add(new Cleaner("Bogdan"));
        peopleList.add(new Teacher("Oksana"));

        List<Staff> staffList1 = new ArrayList<>();
        staffList1.add(new Cleaner("Bogdan"));
        staffList1.add(new Teacher("Oksana"));

        List<Staff> staffList = Arrays.asList(new Cleaner("Bogdan"), new Teacher("Oksana"));

        peopleList.forEach(Person::print);
        staffList.forEach(Staff::salary);
    }
}