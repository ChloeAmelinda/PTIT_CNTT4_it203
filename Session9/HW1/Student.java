package Session9.HW1;

public class Student extends Person {
    String id ;
    double avg;
    public Student(String name, int age, String id, double avg) {
        super(name, age);
        this.id = id;
        this.avg = avg;
    }
    @Override
    public String display(){
        return "Id: "+id+ " Ten: " + name + " tuoi: "+age + " Average:" + avg;
    }


    static void main(String[] args) {
        Student s1= new Student("Trang", 19, "B123",9);
        Student s2= new Student("Nguin", 20,"B2333", 7);
        System.out.println(s1.display());
        System.out.println(s2.display());
    }
}
