package Session14.HW2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        HashMap<String, String> drug = new HashMap<>();
        drug.put("T001","A");
        drug.put("T002","B");
        drug.put("T003","C");

        Scanner sc = new Scanner(System.in);
        System.out.println("Search id:");
        String search = sc.nextLine();


        if (drug.containsKey(search)){
            System.out.println("name drug :" + drug.get(search));
        }else {
            System.out.println("Null");
        }
    }
}
