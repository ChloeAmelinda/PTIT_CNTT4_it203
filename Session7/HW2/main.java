package Session7.HW2;

import Session7.HW1.Student;

public class main {
    static void main(String[] args) {
        int a = 1;
        int b = a;
        Student s = new Student("B123", "A");
        Student c = s;
        System.out.println(b);
        c.display();


    }
}
