package session02.src.HW03;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong sach tra muon:");
        int n = sc.nextInt();

         int total = 0;


        for( int i =1 ; i <= 3 ; i++){
            System.out.println("Nhap so ngay tra sach " + i);
            int day = sc.nextInt();
            total += day * 5000;
        }


        System.out.println("tong tien phat :" + total);
    }
}
