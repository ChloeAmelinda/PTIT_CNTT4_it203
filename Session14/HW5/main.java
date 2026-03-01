package Session14.HW5;

import java.util.Comparator;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        Comparator<Patient> triageComparator = (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return p1.severity - p2.severity;
            }
            return p1.arrivalTime - p2.arrivalTime;
        };

        TreeSet<Patient> queue = new TreeSet<>(triageComparator);

        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
