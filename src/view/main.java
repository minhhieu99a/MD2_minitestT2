package view;

import model.Employee;
import model.FulltimeEmployee;
import controller.Method;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên Full Time ");
            System.out.println("3. Thêm nhân viên Part Time ");
            System.out.println("4. Hiển thị nhân viên FullTime có lương thấp hơn trung bình toàn công ty ");
            System.out.println("5. Hiển thị lương phải trả cho tất cả các nhân viên bán thời gian");
            System.out.println("6. Sắp xếp nhân viên toàn thời gian theo số lương tăng dần");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Số lượng nhân viên có trong công ty là: " + employees.size());

                    System.out.println("Danh sách nhân viên: ");
                    Method.displayEmployee(employees);
                    break;
                case 2:
                    employees.add(Method.creatNewFulltimeEmployee(employees));
                    break;
                case 3:
                    employees.add(Method.creatNewParttimeEmployee(employees));
                    break;
                case 4:
                    Method.displaySalaryLowerAverageSalary(employees);
                    break;
                case 5:
                    Method.payrollForParttime(employees);
                    break;
                case 6:
                    Method.sortSalaryFullTime(employees);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        }
    }
}
