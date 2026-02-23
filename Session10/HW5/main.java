package Session10.HW5;

public class main {
    public static void main(String[] args) {
        System.out.println("          BẢNG LƯƠNG THÁNG 02/2026         ");
        System.out.println("Tên             | Lương cơ bản   | Thưởng     | Tổng lương");

        Employee[] employees = {
                new OfficeStaff("Nguyễn Văn A", 12000000),
                new OfficeStaff("Trần Thị B", 11000000),
                new Manager("Lê Văn C", 25000000, 0.25),
                new Manager("Phạm Thị D", 28000000, 0.30),
                new OfficeStaff("Hoàng Văn E", 9500000)
        };

        for (Employee emp : employees) {
            if (emp instanceof OfficeStaff) {
                ((OfficeStaff) emp).showSalary();
            } else if (emp instanceof Manager) {
                ((Manager) emp).showSalary();
            }
        }
    }
}
