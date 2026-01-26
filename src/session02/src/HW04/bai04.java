package session02.src.HW04;

import java.util.Scanner;

public class bai04 {
    public static void main (String[] args){
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ID:");
        int id = sc.nextInt();

        do {
            System.out.println("Nhap lai ID:");
            id = sc.nextInt();
        }while (id <= 0);
        System.out.println("Ma id "+id+" duoc xac dinh.");
    }
}
