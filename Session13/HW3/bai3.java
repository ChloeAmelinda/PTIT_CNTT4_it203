package Session13.HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai3 {

    static class search {
        public static <T> List<T> searchPatient(List<T> ListA, List<T> ListB) {
            List<T> result = new ArrayList<>();
            for (T item : ListA) {
                if (ListB.contains(item)) {
                    result.add(item);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<Integer> noiKhoaIDs = Arrays.asList(101, 102, 105);
        List<Integer> ngoaiKhoaIDs = Arrays.asList(102, 105, 108);

        // Gọi đúng static method
        List<Integer> commonIDs = search.searchPatient(noiKhoaIDs, ngoaiKhoaIDs);

        System.out.println("Test case output: " + commonIDs);
    }
}