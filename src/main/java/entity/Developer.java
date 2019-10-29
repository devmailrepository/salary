package entity;

public class Developer extends Employee {
    private double bonus;

    public Developer(double ratePerHour, int workDays, double bonus) {
        super(ratePerHour, workDays, EmployeeType.DEVELOPER);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary()+ bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


}
