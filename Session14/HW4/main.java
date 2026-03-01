package Session14.HW4;

import java.util.*;

public class main {
    public static void main(String[] args) {

        List<String> diseases = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        TreeMap<String, Integer> report = new TreeMap<>();

        for (String disease : diseases) {
            report.put(disease, report.getOrDefault(disease, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
