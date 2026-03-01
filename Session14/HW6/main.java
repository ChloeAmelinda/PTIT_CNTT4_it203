package Session14.HW6;
import java.util.*;
public class main {
    public static void main(String[] args) {

        List<Patient> list = Arrays.asList(
                new Patient("Lan", 25, "Tim mạch"),
                new Patient("Hùng", 40, "Nội tiết"),
                new Patient("Mai", 30, "Tim mạch")
        );

        Map<String, List<Patient>> map = new HashMap<>();

        for (Patient p : list) {
            map.computeIfAbsent(p.department, k -> new ArrayList<>()).add(p);
        }

        for (Map.Entry<String, List<Patient>> e : map.entrySet()) {
            System.out.println("Key \"" + e.getKey() + "\" -> Value " + e.getValue());
        }

        String maxDept = null;
        int max = 0;

        for (Map.Entry<String, List<Patient>> e : map.entrySet()) {
            if (e.getValue().size() > max) {
                max = e.getValue().size();
                maxDept = e.getKey();
            }
        }

        System.out.println("Khoa " + maxDept + " đang đông nhất (" + max + " bệnh nhân)");
    }

}
