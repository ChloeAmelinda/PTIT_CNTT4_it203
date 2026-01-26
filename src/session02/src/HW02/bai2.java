package session02.src.HW02;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        java.util.Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ki tu bat ki(A, B, C, D) :");
        String kitu = sc.nextLine();

        switch (kitu){
            case "A" :
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case "B" :
                System.out.println( "Tầng 2: Sách Khoa học");
                break;
            case "C" :
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case "D" :
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Nhap sai roi . Nhap lai !");
                break;
        }
    }
}
