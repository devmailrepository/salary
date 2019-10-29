package entity;

public class ScrumMaster extends Employee {
    public ScrumMaster(double ratePerHour, int workDays) {
        super(ratePerHour, workDays, EmployeeType.SCRUMMASTER);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }
}
