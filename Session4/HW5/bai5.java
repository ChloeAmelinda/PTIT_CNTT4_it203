package Session4.HW5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai5 {
    static void main(String[] args) {
        String str = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        String[] parts = str.split("\\s*\\|\\s*");

        if (parts.length == 4){
            String date = parts[0].trim();
            String user = parts[1].replace("User:", "").trim();
            String action = parts[2].replace("Action:","").trim();
            String bookId = parts[3].replace("BookID:","").trim();

            System.out.println("ngay:"+date);
            System.out.println("Ten :"+user);
            System.out.println("hoat dong:"+action);
            System.out.println("id:"+bookId);
        }
    }
}
