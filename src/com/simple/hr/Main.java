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
        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000, dept2);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000, dept3);
        SalariedEmployee emp4 = new SalariedEmployee("Sarah Thomas", 50000, dept3);
        SalariedEmployee emp5 = new SalariedEmployee("Alex Eucker", 40000, dept2);

        // array to store employees
        Employee[] employees = {emp1, emp2, emp3, emp4, emp5};

        // print employee info
        List<Employee> employeeList = Arrays.asList(employees);

        // print stream
        //employeeList.stream().forEach(System.out::println);

        // group employees by department
        System.out.println("Employees grouped by Department\n");
        Map<String, List<Employee>> groupedByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("  %s%n", employee)
                    );
                }
        );

    }
}
