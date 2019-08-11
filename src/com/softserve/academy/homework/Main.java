package com.softserve.academy.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("volodymyr", "hr", 1365));
        employeeList.add(new Employee("bogdan", "io", 1478));
        employeeList.add(new Employee("vasyl", "ii", 1559));
        employeeList.add(new Employee("dmytro", "it", 2014));
        employeeList.add(new Employee("denys", "it", 2143));

        System.out.println("Unsorted list\n");
        employeeList.forEach(System.out::println);

        Collections.sort(employeeList);

        System.out.println("\nSorted list\n");
        employeeList.forEach(System.out::println);

        System.out.println("");

        for (int i = 0; i < employeeList.size(); i++) {
            for (int j = i + 1; j < employeeList.size(); j++) {

                if (Objects.equals(employeeList.get(i).getSalary(), employeeList.get(j).getSalary())) {
                    System.out.println("Employee with the same salary: " + employeeList.get(i) + " = " + employeeList.get(j));
                }
                if (employeeList.get(i).equals(employeeList.get(j))) {
                    System.out.println("\nSame employees: " + employeeList.get(i) + " = " + employeeList.get(j));
                }
            }
        }
        for (int i = 0; i < employeeList.size(); i++) {

            if (i == 0) {
                System.out.println("\nThe Minimal salary has: " + employeeList.get(0) + "\n");
            }
            if ((i == employeeList.size() - 1)) {
                System.out.println("The Maximal salary has: " + employeeList.get(employeeList.size() - 1) + "\n");
            }
        }
        employeeList.sort(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()));
        System.out.println("Sorted list in reverse way\n");
        employeeList.forEach(System.out::println);
    }
}
