package ThuchanhSS8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    static String id;
    static String name;
    static double score;
    static String rank;

    public Student(){
        id = "";
        name = "";
        score = 0.0;
    }
    public Student(String id , String name, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public static void checkId(String id){
        String regex = "SV\\%d{3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);

        if (!matcher.matches()){
            System.out.println("sai id");
        }else {
            System.out.println("ban da nhap dung id");
        }
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void getRank(){
        if (score >= 8.5) {
            System.out.println("Gioi");
            rank = "gioi";
        } else if (score >= 6.5) {
            System.out.println("Kha");
            rank = "kha";
        }else {
            System.out.println("Trung binh ");
            rank = "trung binh";
        }
    }
    public static String toString(){
        return "id: "+id +" Ten: "+name + "diem: " + score + " hoc luc: " +rank  ;
    }
}
