package session01.src.HW01;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma sach:");
        String bookID = sc.nextLine();

        System.out.println("nhap ten sach:");
        String name = sc.nextLine();

        System.out.println("Nhap nam phat hanh:");
        int publishYear = sc.nextInt();

        System.out.println("Nhap gia:");
        double price = sc.nextDouble();

        System.out.println("sach con trong kho (true/false):");
        boolean isValid = true;

        String status = isValid ? "con sach" :"da muon";
        System.out.println("phieu thong tin sach");
        System.out.println("ten sach: "+name);
        System.out.print("Ma so:" + bookID);
        System.out.println(" | tuoi tho = " + (2026 - publishYear));
        System.out.println("gia ban:" + price);
        System.out.println("tinh trang:" + status);
    }
}