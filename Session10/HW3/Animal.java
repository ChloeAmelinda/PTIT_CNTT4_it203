package Session10.HW3;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.print("Tôi là " + name + " - ");
    }
}
