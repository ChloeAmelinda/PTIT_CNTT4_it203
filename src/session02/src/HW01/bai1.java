package session02.src.HW01;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so tuoi:");
        int age = sc.nextInt();

        System.out.println("Nhap so sach dang muon:");
        int n = sc.nextInt();

        if (age >= 18 && n <=3 ){
            System.out.println("ket qua: Ban DU DIEU KIEN muon sach quy hiem.");

        } else  {
            System.out.println("ket qua: Ban KHONG DU DIEU KIEN muon sach quy hiem");
            if (age <18 ){
                System.out.println("li do : Ban ko du 18t");
            }else if (n>3){
                System.out.println("li do :ban muon qua 3 quyen roi.");
            }
        }

    }
}
