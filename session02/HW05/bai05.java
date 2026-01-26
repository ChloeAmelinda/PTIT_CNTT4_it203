package session02.src.HW05;

import java.util.Scanner;

public class bai05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int legit = 100;
         int n = 0;
         while (true){
             System.out.println("nhap so ngay tre: ");
             n = sc.nextInt();
             if (n == 999){
                 break;
             }
             else if (n >0){
                 System.out.println("Tra tre "+ n + "ngay :-" + (n * 2) + "diem");
                 legit -= n*2;
             }else {
                 System.out.println("tra dung han");
                 legit += n*5;
             }
             
         }
        System.out.println("tong diem uy tin:"+legit);

         if(legit > 120){
             System.out.println("Độc giả Thân thiết");
         }else if (legit >80){
             System.out.println("Độc giả Tiêu chuẩn");
         }else {
             System.out.println("Độc giả cần lưu ý");
         }

    }
}
