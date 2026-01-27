package Session3.HW2;

import java.util.Objects;
import java.util.Scanner;

public class bai2 {
    public static int searchBooks(String[] arr, String search){
        for (int i = 0 ; i < arr.length; i++){
            if (Objects.equals(arr[i], search)){
                return i+1 ;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"A","B","C","D","e"};

        System.out.println("Nhap ten sach can tim:");
        String s = sc.nextLine();
         int result = searchBooks(books,s);
        if (result == -1){
            System.out.println("ko ton tai");
        }else {
            System.out.println("sach co ton tai o vi tri "+result);
        }


    }
}
