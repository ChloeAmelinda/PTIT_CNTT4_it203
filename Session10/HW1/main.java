package Session10.HW1;

public class main {
    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 7.0);

        Shape smallCircle = new Circle(3.5);
        Shape square = new Rectangle(6.0, 6.0);

        System.out.printf("Hình tròn (bán kính = %.1f)%n", ((Circle)circle).radius);
        System.out.printf("   Diện tích     : %.2f%n", circle.getArea());
        System.out.printf("   Chu vi        : %.2f%n", circle.getPerimeter());
        System.out.println();

        System.out.printf("Hình chữ nhật (%.1f x %.1f)%n", ((Rectangle)rectangle).width, ((Rectangle)rectangle).height);
        System.out.printf("   Diện tích     : %.2f%n", rectangle.getArea());
        System.out.printf("   Chu vi        : %.2f%n", rectangle.getPerimeter());
        System.out.println();

    }
}
