package Session6.HW5;

public class main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng sách bằng constructor
        Session6.HW5.Book sach1 = new Session6.HW5.Book("Toán lớp 12", "Nguyễn Văn A", 2023, 120000);
        Session6.HW5.Book sach2 = new Session6.HW5.Book("Văn học Việt Nam", "Trần Thị B", 2020, 85000);
        Session6.HW5.Book sach3 = new Session6.HW5.Book("Lập trình Java", "Lê Minh C", 2024, 250000);

        // Hiển thị thông tin từng cuốn sách
        System.out.println("Danh sách sách trong hệ thống:\n");

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
        sach3.hienThiThongTin();
    }
}
