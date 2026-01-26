package session01.src.HW05;

import java.util.Scanner;

public class bai5 {
    public static void main (String[] args){
      java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Nhap 4 so nguyen:");
        int n = sc.nextInt();

        System.out.println("chu so kiem tra ky vong :");
        int donvi= sc.nextInt();

        int a = n / 1000;

        int b = (n / 100) % 10;

        int c = (n / 10) % 10;

        int d  = n % 10;

        int sumOfFirstThreeNumber = (a+b+c)%10;
        boolean isvalid = true;
        if( sumOfFirstThreeNumber == d && d == donvi){

            System.out.println("ket qua kiem tra ma sach :"+ isvalid);
        }else {
            isvalid = false;
            System.out.println("ket qua kiem tra ma sach :"+ isvalid);
        }


    }
}