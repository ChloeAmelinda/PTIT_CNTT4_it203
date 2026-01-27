package Session3.HW6;

import java.util.*;

public class bai6 {
    public static int[] mergeBooks(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                addUnique(result, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                addUnique(result, b[j]);
                j++;
            } else { // a[i] == b[j]
                addUnique(result, a[i]);
                i++;
                j++;
            }
        }

        // Thêm phần còn lại của mảng a
        while (i < a.length) {
            addUnique(result, a[i]);
            i++;
        }

        // Thêm phần còn lại của mảng b
        while (j < b.length) {
            addUnique(result, b[j]);
            j++;
        }

        // Chuyển List -> int[]
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Hàm phụ để tránh thêm trùng lặp
    private static void addUnique(List<Integer> list, int value) {
        if (list.isEmpty() || list.get(list.size() - 1) != value) {
            list.add(value);
        }
    }

    // Demo
    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {3, 4, 5, 6, 10};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Danh sách sách hoàn chỉnh của thư viện:");
        System.out.println(Arrays.toString(arrayMerge));
    }
}
