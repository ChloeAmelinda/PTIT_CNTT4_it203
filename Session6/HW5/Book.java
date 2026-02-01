package Session6.HW5;


public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String title, String author, int year, double price) {
        this.title  = title;
        this.author = author;
        this.year   = year;
        this.price  = price;
    }

    public void hienThiThongTin() {
        System.out.println("Thông tin sách:");
        System.out.println("  Tên sách    : " + title);
        System.out.println("  Tác giả     : " + author);
        System.out.println("  Năm xuất bản: " + year);
        System.out.printf("  Giá sách    : %.2f VNĐ\n", price);
    }


}