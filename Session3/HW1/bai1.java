package Session3.HW1;

import java.util.Scanner;

public class bai1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new  int[n];


        for (int i =0; i< n; i++){
            System.out.println("Nhap so luong phan tu thu :"+ (i+1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayLibraries(int[] arr){
        for(int i =0 ;i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(",");
        }
    }

    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong sach can quan li:");
        int n = sc.nextInt();
        int[] arr= addBookToLibraries(n);
        displayLibraries(arr);

    }

}
