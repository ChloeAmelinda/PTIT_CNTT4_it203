package Session6.HW4;

public class Employee {
    String id;
    String name;
    double salary;

    // ko co tham so
    public Employee(){
        this.id = "";
        this.name = "";
        this.salary = 0.0;

    }

    //co ma nv va ten
    public Employee(String id , String name){
        this.id = id;
        this.name = name;
        this.salary = 0.0;
    }
    public Employee(String id , String name , double salary){
        this.id = id ;
        this.name = name ;
        this.salary = salary;

    }

    public void display(){
        System.out.printf("id : %s, name: %s , salary: %.2f \n", id, name,salary);
    }
}
