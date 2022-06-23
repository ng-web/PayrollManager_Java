package com.simple.hr;

public class Contractor implements Payable{

    private String name;
    private int hoursWorked;
    private double partsCost;

    public Contractor(String n, int hours, double parts){
        name = n;
        hoursWorked = hours;
        partsCost = parts;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * partsCost;
    }

    @Override
    public String generatePayStub() { // invoice
        return null;
    }
}
