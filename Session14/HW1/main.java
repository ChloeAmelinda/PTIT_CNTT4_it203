package Session14.HW1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class main {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("Nguyễn Văn A – Yên Bái");
        name.add("Trần Thị B – Thái Bình");
        name.add("Nguyễn Văn A – Yên Bái");
        name.add("Lê Văn C – Hưng Yên");



        for (String s:name){
            System.out.printf("%s\t,",s);
        }

    }
}
