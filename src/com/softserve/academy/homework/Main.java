package com.softserve.academy.homework;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Volodymyr", 85.10, 44);

        Employee employee2 = new Employee("Ivan",60.50, 34);

        Employee employee3 = new Employee("Rostyslav",77.00, 40);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        Employee [] employee = {employee1, employee2, employee3};
        int t = 0;
        for (Employee e : employee) {
            t = t + e.getHours();
            Employee.setTotalHours(t);}

        System.out.println("Employees have worked out: " + Employee.getTotalHours() + " hours");
    }
}
