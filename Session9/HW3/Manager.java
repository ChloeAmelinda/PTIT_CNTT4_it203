package Session9.HW3;

public class Manager extends Employee{
    String room;

    public Manager(String name, double salary , String room) {
        super(name, salary);
        this.room = room;
    }
    public void display(){
        System.out.println("ten : " + name +"luong : "+salary + "phong ban : "+room );
    }
}
