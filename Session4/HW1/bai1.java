package Session4.HW1;


import java.util.Scanner;

public class bai1 {
    static String tacgia(String s){
        String[] str = s.split("\s+");
        String result = "";

        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten sach :");
        String name = sc.nextLine().trim().toUpperCase();

        System.out.println("Nhap tac gia:");
        String author = sc.nextLine().trim();


        System.out.println("Nhap the loai:");
        String title = sc.nextLine().trim();



        System.out.printf("[%s] - tac gia : %s", name,tacgia(author));


    }
}
