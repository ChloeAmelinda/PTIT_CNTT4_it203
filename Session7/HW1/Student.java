package Session7.HW1;

public class Student {
    private  String masv;
    private  String tensv;

    static int totalStudent = 0;

    public Student(String masv , String tensv){
        this.masv = masv ;
        this.tensv = tensv;

        totalStudent++;
    }
    public void display(){
        System.out.printf("masv: %s\t , tensv: %s\n",masv,tensv);
    }
    public static void sum(){
        System.out.println("Tong so sv:"+ totalStudent);
    }

}
