package Session5.HW2;

public class main {
    static void main(String[] args) {
        bai2.Account a = new bai2.Account("trang","12345","trang@gmail.com");
        a.display();
        a.changePassword("12345","2468");
        a.display();
    }
}
