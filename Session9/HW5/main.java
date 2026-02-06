package Session9.HW5;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class main {
    static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new OfficeEmployee("Nguyen Van A", 10000000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30000));

        double totalSalary = 0;
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN")); // Sử dụng locale Việt Nam để định dạng số với dấu phẩy

        System.out.println("Danh sách lương nhân viên:");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            double salary = emp.calculateSalary();
            totalSalary += salary;

            String type = emp instanceof OfficeEmployee ? "Office" : "Production";
            String detail = "";
            if (emp instanceof ProductionEmployee) {
                ProductionEmployee p = (ProductionEmployee) emp;
                detail = " (" + p.getNumOfProducts() + " sản phẩm * " + formatter.format(p.getPrice()) + ")";
            }

            System.out.println((i + 1) + ". " + emp.getName() + " (" + type + ") - Lương: " + formatter.format(salary) + detail);
        }

        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + formatter.format(totalSalary));
    }
}
