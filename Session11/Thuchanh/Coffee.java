package Session11.Thuchanh;

public class Coffee extends Drink{
    public boolean hasMilk = true;


    public Coffee(String id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice(){
        if (hasMilk == true){
            return price + 5000;
        }else {
            return  price;
        }

    }
     @Override
    public void playInfo(){
        if (hasMilk == true){
            System.out.printf("co sua");
        }else {
            System.out.printf("den da");
        }
     }
}
