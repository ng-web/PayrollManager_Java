package com.simple.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // department objects
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        // added department to a list
        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        // address object
        Address address = new Address("5 Emerald close", "Kingston", "Kingston", "00000");

        // company object
        Company abc = new Company("ABC Company", address, departments);

        // salaried employees
        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000);

        

    }
}
