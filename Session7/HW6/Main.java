package Session7.HW6;

public class Main {

    public static void main(String[] args) {

        // Tạo 3 user
        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abc123");
        User u3 = new User(3, "dev_c", "xyz789");


        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        UserManager.printAllUsers();

        System.out.println("\n>> Kiểm tra đăng nhập:");
        testLogin("dev_a", "123456");
        testLogin("dev_b", "sai_pass");
        testLogin("dev_c", "xyz789");
        testLogin("admin", "123");
    }

    private static void testLogin(String username, String password) {
        boolean success = UserManager.checkLogin(username, password);
        System.out.printf("- Login (\"%s\", \"%s\"): %s\n",
                username, password,
                success ? "Thành công!" : "Thất bại!");
    }
}