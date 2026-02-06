package Session9.HW6;

public class Rectangle extends Shape{
    private double width;
    private double height;

    // Constructor cho hình chữ nhật thông thường (2 tham số)
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor overloading cho hình vuông (1 tham số)
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Phương thức hỗ trợ kiểm tra xem có phải hình vuông không
    public boolean isSquare() {
        return width == height;
    }
}
