package Session10.HW5;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.printf("%-15s | Lương cơ bản: %10.0f | ", name, baseSalary);
    }
}
