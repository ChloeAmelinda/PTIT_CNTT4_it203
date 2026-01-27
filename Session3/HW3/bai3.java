package Session3.HW3;

import java.util.Scanner;

public class bai3 {
    static void maxQuantityOfBooks(String[] names, int[] quantities){
        String maxName = "" ;
        int max=0;
        for(int i = 0; i<names.length; i++){
           if (quantities[i] > max){
               max = quantities[i];
               maxName = names[i];
           }

        }
        System.out.println("ten sach :"+ maxName);
        System.out.println("so luong :"+ max );

    }
    static void minQuantityOfBooks(String[] names, int[] quantities){
        String minName = "" ;
        int min=Integer.MAX_VALUE;
        for(int i = 0; i<names.length; i++){
            if (quantities[i] < min){
                min = quantities[i];
                minName = names[i];
                }

        }
        System.out.println("ten sach :"+ minName);
        System.out.println("so luong :"+ min );



    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Python","Java","A", "C","B"};
        int[] quatities = {2,4,1,5,6};

        maxQuantityOfBooks(names,quatities);
        minQuantityOfBooks(names, quatities);
    }
}
