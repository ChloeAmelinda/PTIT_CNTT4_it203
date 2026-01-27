package Session3.HW5;

import java.util.Scanner;

public class Bai5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Khong tim thay ma sach can xoa");
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Da xoa ma sach: " + bookId);
        return n - 1;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n <= 0) {
            System.out.println("Danh sach rong");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101,102, 103, 104, 105};
        int n = books.length;

        while (n > 0) {
            System.out.println("kho sach hien tai:");
            displayBooks(books, n);

            System.out.print("Nhap ma sach can xoa: ");
            int bookId = sc.nextInt();
            n = deleteBook(books, n, bookId);

            if (n == 0) {
                System.out.println("Danh sach rong, dung chuong trinh");
                break;
            }
        }
    }
}