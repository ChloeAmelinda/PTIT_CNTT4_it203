package Session6.HW1;

public class bai1 {
    static class Student{
         String id;
         String name;
         int year;
         double tb;



        public  Student(String id, String name, int year , double tb){
            this.id = id ;
            this.name = name;
            this.year = year;
            this.tb = tb;
        }

        public void display(){
            System.out.println("id:"+id);
            System.out.println("name:" + name);
            System.out.println("year:" +year);
            System.out.println("average:"+tb);
        }
    }



}
