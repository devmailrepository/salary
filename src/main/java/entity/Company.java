package entity;

import java.util.List;

public class Company {
    private String name;
    private double budget;
    private List<Employee> employeeList;

    public Company(String name, double budget, List<Employee> employeeList) {
        this.name = name;
        this.budget = budget;
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
