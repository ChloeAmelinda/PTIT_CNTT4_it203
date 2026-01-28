package Session4.HW2;

public class bai2 {
    static void main(String[] args) {

        String str = "Sach giao khoa toan lop 12 , ke: A1 - 102 , tinh trang moi";
        if(str.contains("ke")){
            int start = str.indexOf("ke:") +"ke:".length();
            int end = str.indexOf(",", start);

            String position = str.substring(start,end).trim();
            System.out.printf("vi tri : %s\n", position);
            String newStr = str.replace("ke" , "vi tri luu tru");
            System.out.printf(newStr);

        }
    }
}
