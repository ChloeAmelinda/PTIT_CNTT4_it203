package Session7.HW6;

import java.util.ArrayList;

public class UserManager {

    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        if (u != null) {
            users.add(u);
        }
    }

    public static boolean checkLogin(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        for (User u : users) {
            if (username.equals(u.username) && password.equals(u.password)) {
                return true;
            }
        }
        return false;
    }

    public static void printAllUsers() {
        if (users.isEmpty()) {
            System.out.println("(Chưa có user nào)");
            return;
        }

        System.out.println("Danh sách hiện tại:");
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }
}
