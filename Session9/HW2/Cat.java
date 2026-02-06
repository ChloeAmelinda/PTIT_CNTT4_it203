package Session9.HW2;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("mel mel");

    }
    static void main(String[] args) {
        Cat c = new Cat();
        Animal a= new Animal();
        a.sound();
        c.sound();
    }
}
