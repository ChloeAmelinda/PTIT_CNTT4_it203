package Session11.Thuchanh;

public abstract class Drink {
    public String id;
    public String name;
    public double price;

    public Drink(String id,String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    abstract double calculatePrice();
    void playInfo(){
        System.out.printf("ma :%-10s, ten san pham: %-10s, gia : %.2f",id,name,price);
        System.out.println();
    }


}
