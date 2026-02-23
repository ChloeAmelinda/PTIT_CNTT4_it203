package Session10.HW3;

public class main {
    public static void main(String[] args) {


        Duck donald = new Duck("Donald");
        donald.introduce();
        donald.swim();
        donald.fly();

        System.out.println();

        Fish nemo = new Fish("Nemo");
        nemo.introduce();
        nemo.swim();

    }
}
