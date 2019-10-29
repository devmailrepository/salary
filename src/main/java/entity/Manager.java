package entity;

public class Manager extends Employee {

    public Manager(double ratePerHour, int workDays) {
        super(ratePerHour, workDays, EmployeeType.MANAGER);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
