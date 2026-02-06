package Session9.HW6;
import java.util.ArrayList;
import java.util.List;
public class main {
    static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(3.0, 4.0));
        shapes.add(new Rectangle(6.0));            

        double totalArea = 0.0;

        System.out.println("Kết quả tính toán hình học:");

        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            double area = shape.calculateArea();
            totalArea += area;

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.printf("%d. Hình tròn (r=%.1f) - Diện tích: %.2f%n",
                        (i + 1), c.getRadius(), area);
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                if (r.isSquare()) {
                    System.out.printf("%d. Hình vuông (cạnh %.1f) - Diện tích: %.2f%n",
                            (i + 1), r.getWidth(), area);
                } else {
                    System.out.printf("%d. Hình chữ nhật (%.1f x %.1f) - Diện tích: %.2f%n",
                            (i + 1), r.getWidth(), r.getHeight(), area);
                }
            }
        }
        System.out.printf("=> Tổng diện tích các hình: %.2f%n", totalArea);
    }
}
