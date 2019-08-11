package com.softserve.academy.homework;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private String department;
    private Integer salary;

    Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    private String getName() {
        return name;
    }

    private String getDepartment() {
        return department;
    }

    Integer getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getName().equals(employee.getName()) &&
                getDepartment().equals(employee.getDepartment()) &&
                getSalary().equals(employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDepartment(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.getSalary(), employee.getSalary());
    }
}

