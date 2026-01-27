package Session3.HW4;

import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    static void sortBooks(int[] arr){
        int i ,j, temp;
        boolean swapped ;
        for ( i = 0; i < arr.length; i++) {
            swapped = false;
            for ( j = 0; j < arr.length -1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (swapped != false){
                break;
            }
        }

    }

    static void display ( int arr[]){

            System.out.print(Arrays.toString(arr) + ", ");

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,34,23,12,6,4};
        sortBooks(arr);
        display(arr);

    }
}
