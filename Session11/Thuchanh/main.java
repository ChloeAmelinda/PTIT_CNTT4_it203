package Session11.Thuchanh;

public class main {
    static void main(String[] args) {
        Drink[] drink = new Drink[3];

        drink[0] = new Coffee("C1","30000",1000,true);
        drink[1] = new FruitJuice("F1","Nước cam",100,10);
        drink[2] = null;

        for (int i = 0; i < drink.length; i++) {
            if (drink[i] != null) {
                drink[i].playInfo();
                drink[i].calculatePrice();

                if (drink[i] instanceof IMixable){
                    ((IMixable) drink[i]).mix();
                }
            }
        }

    }
}
