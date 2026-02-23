package Session10.HW5;

public class OfficeStaff extends Employee{
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    public void showSalary() {
        displayInfo();
        System.out.printf("Thưởng: %8s | Tổng lương: %10.0f%n", "0", calculateSalary());
    }
}
