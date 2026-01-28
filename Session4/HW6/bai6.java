package Session4.HW6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập đánh giá: ");
        String rate = sc.nextLine().trim();

        String[] blackList = {"bad", "fuck", "te", "do", "xau", "ngu"}; // bạn có thể thêm từ

        String danhgiaLower = rate.toLowerCase();
        String result = rate;

        for (String tuCam : blackList) {
            String tuCamLower = tuCam.toLowerCase();
            int doDai = tuCamLower.length();
            String thayThe = "*".repeat(doDai);

            int position = 0;

            while ((position = danhgiaLower.indexOf(tuCamLower, position)) != -1) {
                boolean laTuDocLap = true;

                // Kiểm tra ký tự trước
                if (position > 0) {
                    char truoc = danhgiaLower.charAt(position - 1);
                    if (Character.isLetterOrDigit(truoc)) {
                        laTuDocLap = false;
                    }
                }

                // Kiểm tra ký tự sau
                int ketThuc = position + doDai;
                if (ketThuc < danhgiaLower.length()) {
                    char sau = danhgiaLower.charAt(ketThuc);
                    if (Character.isLetterOrDigit(sau)) {
                        laTuDocLap = false;
                    }
                }

                if (laTuDocLap) {
                    // Thay thế trong result
                    String truoc = result.substring(0, position);
                    String sau = result.substring(position + doDai);
                    result = truoc + thayThe + sau;

                    // Cập nhật lại lower case để tìm tiếp
                    danhgiaLower = result.toLowerCase();

                    // Quan trọng: reset position về 0 vì chuỗi đã thay đổi
                    position = 0;
                } else {
                    // Không thay → nhảy qua từ này
                    position += doDai;
                }
            }
        }

        System.out.println("Đánh giá sau khi lọc:");
        System.out.println(result);

        sc.close();
    }
}