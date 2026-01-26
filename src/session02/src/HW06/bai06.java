package session02.src.HW06;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class bai06 {
    static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);

        int max =0;
        int min = Integer.MAX_VALUE;

        int sum = 0;

        for (int i = 1 ; i<= 7 ;i++){
            System.out.println("Nhap luot ngay muon thu "+i+":");
            int day = sc.nextInt();

            if ( day == 0){
                continue;
            }

            max = Math.max(max, day);
            min = Math.min(min,day);
            sum += day;


        }

        double avage=sum/7;
        System.out.println("max:"+max);
        System.out.println("min :"+min);
        System.out.println("trung binh"+ avage );
    }
}
