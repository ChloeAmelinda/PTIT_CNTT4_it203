package Session16.thuchanh;

public abstract class Product {
    String id;
    String name;
    double price;
    public Product(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public double calculateFinalPrice(){
        return price;
    }
    public void displayInfo(){
        System.out.printf("id:%-8s\t ,name : %-5s\t, price:%-5f", id, name,price);
    }

    public String getId() {
        return id;
    }
}
