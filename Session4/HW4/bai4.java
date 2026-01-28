package Session4.HW4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma the:");
        String id = sc.nextLine().trim();

        String regex  = "TV2023\\d+$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(id);

        if (matcher.matches()){
            System.out.println("id hop le");
        }else {
            System.out.println("ko hop le");
            if(id.startsWith("TV")){
                System.out.println("thieu TV");
            }else {
                System.out.println("thieu 2023");
            }
        }





    }
}
