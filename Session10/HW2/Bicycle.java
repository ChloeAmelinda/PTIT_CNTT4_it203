package Session10.HW2;

public class Bicycle extends Vehicle{
    public Bicycle(String brand) {
        super(brand);  // Gọi constructor của lớp cha
    }

    @Override
    public void move() {
        System.out.println("Di chuyển bằng sức người");
    }
}
