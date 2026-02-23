package Session10.HW5;

public class Manager extends Employee implements BonusCalculator{
    private double bonusRate;

    public Manager(String name, double baseSalary, double bonusRate) {
        super(name, baseSalary);
        this.bonusRate = bonusRate;
    }

    @Override
    public double getBonus() {
        return baseSalary * bonusRate;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }

    public void showSalary() {
        displayInfo();
        System.out.printf("Thưởng: %8.0f | Tổng lương: %10.0f%n", getBonus(), calculateSalary());
    }
}
