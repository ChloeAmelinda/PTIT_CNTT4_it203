package Session10.HW6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tai nghe Sony WH-1000XM5", 9500000));
        products.add(new Product("iPhone 16 Pro Max", 34990000));
        products.add(new Product("MacBook Air M3", 28990000));
        products.add(new Product("Samsung Galaxy S25 Ultra", 32990000));
        products.add(new Product("OPPO Find X8 Pro", 22990000));
        products.add(new Product("Pin sạc dự phòng 20000mAh", 890000));

        System.out.println("Danh sách sản phẩm gốc:");
        System.out.println("-------------------------------------------");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("Sắp xếp theo GIÁ tăng dần (Anonymous Class):");
        System.out.println("-------------------------------------------");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();

        Collections.sort(products, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        System.out.println("Sắp xếp theo TÊN (A-Z) (Lambda):");
        System.out.println("-------------------------------------------");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
