package session01.src.HW06;

import java.util.Scanner;

public class bai6 {
    public static void main ( String[] args){
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thu tu sach :");
        int stt = sc.nextInt();

        int ke = (stt - 1)/25 + 1;

        int vitri = (stt - 1)%25 + 1;

        String phanKhu = (ke > 10) ? "khu vien" : "khu can";

        System.out.println("sach so " + stt);
        System.out.println("dia chi:" + ke + "-vi tri:" + vitri);
        System.out.println("phan khu:"+ phanKhu);
    }
}