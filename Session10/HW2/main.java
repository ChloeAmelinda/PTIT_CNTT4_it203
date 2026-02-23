package Session10.HW2;

public class main {
    public static void main(String[] args) {

        // Tạo các đối tượng phương tiện
        Vehicle car1 = new Car("Toyota");
        Vehicle car2 = new Car("Honda");
        Vehicle bike1 = new Bicycle("Martin");
        Vehicle bike2 = new Bicycle("Giant");

        System.out.println();

        car1.displayInfo();
        car2.displayInfo();
        bike1.displayInfo();
        bike2.displayInfo();

        // Hoặc cách viết ngắn gọn hơn:
        System.out.println("\n--- Danh sách phương tiện ---");
        Vehicle[] vehicles = {
                new Car("Mercedes"),
                new Bicycle("Trek"),
                new Car("VinFast"),
                new Bicycle("Thúy")
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
