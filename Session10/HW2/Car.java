package Session10.HW2;

public class Car extends Vehicle{
    public Car(String brand) {
        super(brand);  // Gọi constructor của lớp cha
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng động cơ");
    }
}
