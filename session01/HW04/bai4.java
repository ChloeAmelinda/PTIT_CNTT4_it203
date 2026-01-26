package session01.src.HW04;

import java.util.Scanner;

public class bai4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ty gia:");
        double price= sc.nextDouble();

        float tyGia = 25450.0f;
        double sum = (tyGia *price);

        System.out.println("gia chinh xac: "+sum );
        System.out.println("Gia lam tron:"+ (long)sum);
    }
}