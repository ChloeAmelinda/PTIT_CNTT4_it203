package Session9.HW2;

public class dog extends Animal{
    @Override
    public void sound(){
        System.out.println("go go");
    }

    static void main(String[] args) {
        dog d = new dog();
        Animal a= new Animal();
        a.sound();
        d.sound();
    }

}
