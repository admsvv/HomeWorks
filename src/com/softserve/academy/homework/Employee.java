package com.softserve.academy.homework;

public class Employee {

    private String name;
    private double rate;
    private int hours;
    private static int totalHours;
    private static int countObj;

    Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        countObj++;
    }

    void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    void setRate(double rate) {
        this.rate = rate;
    }
    public double getRate() {
        return rate;
    }

    void setHours(int hours) {
        this.hours=hours;
    }
    int getHours(){
        return hours;
    }

    public static void setCountObj(int countObj) {
        Employee.countObj = countObj;
    }

    static void setTotalHours(int totalHours) {
        Employee.totalHours = totalHours;
    }

    static int getTotalHours() {
        return totalHours;
    }

    public void changeRate(double newRate) {}

    public double bonuses() {
        return rate * 0.3;}

    @Override
    public String toString() {
        return "Employee Name is " + name + ", rate = " + rate + ", hours = " + hours;
    }
}

