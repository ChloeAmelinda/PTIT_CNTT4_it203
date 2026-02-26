package Session13.HW6;

import java.util.*;

public class main {

    static List<Medicine> medicines = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU KÊ ĐƠN =====");
            System.out.println("1. Thêm thuốc");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ (<50k)");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addMedicine();
                case 2 -> adjustQuantity();
                case 3 -> deleteMedicine();
                case 4 -> printInvoice();
                case 5 -> findCheapMedicine();
                case 6 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1. Thêm thuốc
    static void addMedicine() {
        System.out.print("Mã thuốc: ");
        String id = sc.nextLine();

        // kiểm tra trùng
        for (Medicine m : medicines) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Thuốc đã tồn tại. Nhập số lượng thêm: ");
                int addQty = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + addQty);
                System.out.println("Đã cộng thêm số lượng.");
                return;
            }
        }

        System.out.print("Tên thuốc: ");
        String name = sc.nextLine();

        System.out.print("Đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Số lượng: ");
        int qty = Integer.parseInt(sc.nextLine());

        medicines.add(new Medicine(id, name, price, qty));
        System.out.println("Thêm thuốc thành công!");
    }

    // 2. Điều chỉnh số lượng
    static void adjustQuantity() {
        System.out.print("Nhập mã thuốc: ");
        String id = sc.nextLine();

        for (Iterator<Medicine> it = medicines.iterator(); it.hasNext();) {
            Medicine m = it.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());

                if (newQty == 0) {
                    it.remove();
                    System.out.println("Đã xóa thuốc vì số lượng = 0");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Cập nhật thành công!");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy thuốc!");
    }

    // 3. Xóa thuốc
    static void deleteMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();

        medicines.removeIf(m -> m.getDrugId().equalsIgnoreCase(id));
        System.out.println("Nếu tồn tại, thuốc đã được xóa.");
    }

    // 4. In hóa đơn
    static void printInvoice() {
        if (medicines.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        double total = 0;

        System.out.println("\n====== HÓA ĐƠN ======");
        System.out.printf("%-10s %-15s %-10s %-8s %-12s%n",
                "Mã", "Tên", "Đơn giá", "SL", "Thành tiền");

        for (Medicine m : medicines) {
            double itemTotal = m.getTotalPrice();
            total += itemTotal;

            System.out.printf("%-10s %-15s %-10.0f %-8d %-12.0f%n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    itemTotal);
        }

        System.out.println("-----------------------------");
        System.out.printf("TỔNG TIỀN: %.0f VNĐ%n", total);

        // reset danh sách sau khi in
        medicines.clear();
        System.out.println("Đã xóa đơn sau khi in.");
    }

    // 5. Thuốc giá rẻ
    static void findCheapMedicine() {
        boolean found = false;
        for (Medicine m : medicines) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m.getDrugId() + " - " + m.getDrugName()
                        + " - Giá: " + m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá < 50k.");
        }
    }
}
