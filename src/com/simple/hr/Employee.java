package com.simple.hr;

public abstract class Employee implements Payable{

    private String name;
    private double payRate;
    private final int EMPLOYEE_ID;
    private Address address;
    private Department department;
    private static int nextID = 1000;
    public static double STARTING_PAY_RATE = 7.75;

    public Employee(String name){
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double pay){
        this.name = name;
        this.payRate = pay;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public String getName() { return name; }

    public int getEmployeeID() { return EMPLOYEE_ID; }

    public double getPayRate() { return payRate; }

    public String getDepartment() { return department.getName(); }

    public void changeName(String newName) { name = newName; }

    public void changePayRate(double newRate) { payRate = newRate; }

    public void setAddress(Address addr) { address = addr; }

    public void displayAddress() { address.getAddress(); }

    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

}
