package Session10.HW3;

public class Duck extends Animal implements Swimmable,Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Vịt bơi rất giỏi trên mặt nước!");
    }

    @Override
    public void fly() {
        System.out.println("Vịt bay được, dù không bay cao lắm.");
    }
}
