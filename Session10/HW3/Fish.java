package Session10.HW3;

public class Fish extends Animal implements Swimmable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Cá bơi tung tăng dưới nước.");
    }
}
