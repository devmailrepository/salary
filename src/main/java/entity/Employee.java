package entity;

public class Employee {

    private double ratePerHour;
    private int workDays;
    private EmployeeType employeeType;

    public Employee(double ratePerHour, int workDays, EmployeeType employeeType) {
        this.ratePerHour = ratePerHour;
        this.workDays = workDays;
        this.employeeType = employeeType;
    }

    public double getSalary(){
        return ratePerHour*workDays*8;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public EmployeeType getUserType() {
        return employeeType;
    }

    public void setUserType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ratePerHour=" + ratePerHour +
                ", workDays=" + workDays +
                ", employeeType=" + employeeType +
                '}';
    }



}
