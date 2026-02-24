package Session11.Thuchanh;

public class FruitJuice extends Drink implements IMixable{
    public int discountPercent;


    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice(){
        return price - (price * discountPercent /100);

    }
    @Override
    public void mix(){
        System.out.printf("Đang ép trái cây tươi");
        System.out.println();
    }

}
