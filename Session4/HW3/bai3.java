package Session4.HW3;

public class bai3 {
    static void main(String[] args) {
        String[] transactions = {"BH001-20/01", "BK008-21/01" , "vg-099-22/01"};


        for (int i =0 ; i < transactions.length; i++){
            StringBuilder sb = new StringBuilder("giao dich:");
            sb.append(transactions[i]);
            System.out.println(sb);
        }

    }
}
