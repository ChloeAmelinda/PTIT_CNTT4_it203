package Session6.HW6;

public class main {
    public static void main(String[] args) {
        try {
            System.out.println("Test 1: Tạo user hợp lệ");
            User u1 = new User("U001", "nguyenvana", "matkhau123", "vana@example.com");
            u1.hienThiThongTin();

            System.out.println("\nTest 2: Thay đổi email hợp lệ");
            u1.setEmail("nguyenvana.new@gmail.com");
            u1.hienThiThongTin();

            System.out.println("\nTest 3: Thử email không hợp lệ");
            u1.setEmail("invalid.email@");

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        try {
            System.out.println("\nTest 4: Thử password rỗng");
            User u2 = new User("U002", "tranvanb", "", "b@example.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        try {
            System.out.println("\nTest 5: Thử email rỗng");
            User u3 = new User("U003", "levanc", "abc123", "");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        try {
            System.out.println("\nTest 6: Tạo user hợp lệ khác");
            User u4 = new User("U004", "phamthid", "securepass2025", "d.pham@company.vn");
            u4.hienThiThongTin();

            System.out.println("\nTest 7: Thay đổi password");
            u4.setPassword("newpass2026");
            u4.hienThiThongTin();

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
