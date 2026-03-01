package Session14.HW3;

import java.util.HashSet;
import java.util.Set;

public class main {
    static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");

        Set<String> s2 = new HashSet<>();
        s2.add("A");
        s2.add("B");

       Set<String> s3 = new HashSet<>(s1);
       s3.retainAll(s2);
       System.out.println("dangerous: "+s3);

       Set<String> s4 = new HashSet<>(s1);
       s4.removeAll(s2);
       System.out.println("medicine safe:" + s4);



    }
}
