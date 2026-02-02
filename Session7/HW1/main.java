package Session7.HW1;

public class main {
    static void main(String[] args) {
        Student s1 = new Student("B1234", "A");
        Student s2 = new Student("B2345", "B");

        s1.display();
        s2.display();

        Student.sum();
    }

}
