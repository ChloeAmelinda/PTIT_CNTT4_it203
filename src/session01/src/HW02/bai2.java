package session01.src.HW02;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay cham tre:");
        int n = sc.nextInt();

        System.out.println("Nhap so ngay muon:");
        int m = sc.nextInt();

        int total = n * m * 5000;
        int sum=total;

        boolean isvalid = true;


        if( total > 50000 ){
            isvalid = true;
        }else {
            isvalid = false;
        }

        System.out.println("tien phat goc" + total);
        if( n > 7 && m >= 3){
            total *= 0.2;
            System.out.println("tien phat sau dieu chinh" + (sum +total));
        }else {
            System.out.println("tien phat sau dieu chinh" + total);
        }

        System.out.println("yeu cau khoa the " + isvalid );

    }




}