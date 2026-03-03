package Session16.thuchanh;

public class main {
    static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        productRepository.add(new ElectronicProduct("E01","A",12, 3));
        productRepository.add(new ElectronicProduct("E02", "B", 15, 1));
        productRepository.add(new FoodProduct("F01", "C", 20, 3));
        productRepository.add(new FoodProduct("F02", "D", 66 , 2));

        

    }
}
