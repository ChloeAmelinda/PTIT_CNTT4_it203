package Session9.HW4;



public class main {
    static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Dog dog = (Dog) a;
        dog.eat();
    }
}
