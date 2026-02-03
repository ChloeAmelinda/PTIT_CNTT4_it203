package ThuchanhSS8;

import java.util.Scanner;
public class main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("===== QUẢN ẢN LÝ ĐIỂM SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo Học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.println("==================================");

            System.out.println("Nhập lựa chọn :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Nhap id sinh vien :");
                    String idLocal = sc.nextLine();


                    System.out.println("Nhap ten sinh vien :");
                    String nameLocal = sc.nextLine();

                    System.out.println("Nhap diem sinh vien:");
                   double scoreLocal = sc.nextInt();

                   Student newStudent = new Student(idLocal,nameLocal,scoreLocal);


                    break;
                case 2:
                    Student.toString();
                    break;
                case 3:
                    System.out.println("Nhap hoc luc can tim");
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Nhap lai");
                    break;
            }
        }while (choice != 5);
    }
}
