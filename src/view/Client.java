package view;

import model.Employee;
import model.FulltimeEmployee;
import controller.EmployeeManager;
import model.PartimeEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    private static ArrayList<Employee> employeeListClient = EmployeeManager.employeeList;

    public static void main(String[] args) {
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
            System.out.println("7. Sửa thông tin nhân viên theo Id");
            System.out.println("0. Exit!");
            System.out.println("Nhập lựa chọn: ");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Số lượng nhân viên có trong công ty là: " + employeeListClient.size());
                    System.out.println("Danh sách nhân viên: ");
                    EmployeeManager.displayEmployee();
                    break;
                case 2:
                    EmployeeManager.addNewFulltimeEmployee();
                    break;
                case 3:
                    EmployeeManager.addNewParttimeEmployee();
                    break;
                case 4:
                    EmployeeManager.displaySalaryLowerAverageSalary();
                    break;
                case 5:
                    EmployeeManager.payrollForParttime();
                    break;
                case 6:
                    EmployeeManager.sortSalaryFullTime();
                    break;
                case 7 :
                    EmployeeManager.editEmployeeById();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        }
    }

    public static FulltimeEmployee creatNewFulltimeEmployee() {
        Scanner inputIdFullTime = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên Full Time: ");
        String idFullTime = inputIdFullTime.nextLine();

        Scanner inputNameFullTime = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên Full Time: ");
        String nameFullTime = inputNameFullTime.nextLine();

        Scanner inputAgeFullTime = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên Full Time: ");
        int ageFullTime = inputAgeFullTime.nextInt();

        Scanner inputPhoneFullTime = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên Full Time: ");
        String phoneFullTime = inputPhoneFullTime.nextLine();

        Scanner inputEmailFullTime = new Scanner(System.in);
        System.out.println("Nhập email nhân viên Full Time: ");
        String emailFullTime = inputEmailFullTime.nextLine();

        Scanner inputBonus = new Scanner(System.in);
        System.out.println("Nhập số tiền thưởng: ");
        double bonus = inputBonus.nextDouble();

        Scanner inputFineMoney = new Scanner(System.in);
        System.out.println("Nhập số tiền phạt: ");
        double fineMoney = inputFineMoney.nextDouble();

        Scanner inputBasicSalary = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        double basicSalary = inputBasicSalary.nextDouble();

        FulltimeEmployee newEmployeeFullTime = new FulltimeEmployee(idFullTime, nameFullTime, ageFullTime, phoneFullTime, emailFullTime, bonus, fineMoney, basicSalary);
        return newEmployeeFullTime;
    }

    public static PartimeEmployee creatNewParttimeEmployee() {
        Scanner inputIdPartTime = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên Part Time: ");
        String idPartTime = inputIdPartTime.nextLine();

        Scanner inputNamePartTime = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên Part Time: ");
        String namePartTime = inputNamePartTime.nextLine();

        Scanner inputAgePartTime = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên Part Time: ");
        int agePartTime = inputAgePartTime.nextInt();

        Scanner inputPhonePartTime = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên Part Time: ");
        String phonePartTime = inputPhonePartTime.nextLine();

        Scanner inputEmailPartTime = new Scanner(System.in);
        System.out.println("Nhập email nhân viên Part Time: ");
        String emailPartTime = inputEmailPartTime.nextLine();

        Scanner inputWorkHourOfPartTime = new Scanner(System.in);
        System.out.println("Nhập số giờ làm việc nhân viên Part Time : ");
        double WorkHour = inputWorkHourOfPartTime.nextDouble();

        PartimeEmployee newPartTimeEmployee = new PartimeEmployee(idPartTime, namePartTime, agePartTime, phonePartTime, emailPartTime, WorkHour);
        return newPartTimeEmployee;
    }

    public static int getEmployeeById() {
        Scanner inputEmployeeCode = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên mà bạn muốn sửa : ");
        String employeeCode = inputEmployeeCode.nextLine();
        for (int i = 0; i < employeeListClient.size(); i++) {
            Employee employee = employeeListClient.get(i);
            if (employee.getIdEmployee().equals(employeeCode)) {
                return i;
            }
        }
        return -1;
    }

    public static FulltimeEmployee editFulltimeEmployee() {
        Scanner inputIdFullTime = new Scanner(System.in);
        System.out.println("Nhập lại Id nhân viên Full Time bạn muốn sửa: ");
        String editIdFullTime = inputIdFullTime.nextLine();

        Scanner inputNameFullTime = new Scanner(System.in);
        System.out.println("Nhập lại tên nhân viên Full Time: ");
        String editNameFullTime = inputNameFullTime.nextLine();

        Scanner inputAgeFullTime = new Scanner(System.in);
        System.out.println("Nhập lại tuổi nhân viên Full Time bạn muốn sửa: ");
        int editAgeFullTime = inputAgeFullTime.nextInt();

        Scanner inputPhoneFullTime = new Scanner(System.in);
        System.out.println("Nhập lại số điện thoại nhân viên Full Time bạn muốn sửa: ");
        String editPhoneFullTime = inputPhoneFullTime.nextLine();

        Scanner inputEmailFullTime = new Scanner(System.in);
        System.out.println("Nhập lại email nhân viên Full Time bạn muốn sửa: ");
        String editEmailFullTime = inputEmailFullTime.nextLine();

        Scanner inputBonus = new Scanner(System.in);
        System.out.println("Nhập lại số tiền thưởng bạn muốn sửa: ");
        double editBonus = inputBonus.nextDouble();

        Scanner inputFineMoney = new Scanner(System.in);
        System.out.println("Nhập lại số tiền phạt bạn muốn sửa: ");
        double editFineMoney = inputFineMoney.nextDouble();

        Scanner inputBasicSalary = new Scanner(System.in);
        System.out.println("Nhập lại lương cơ bản bạn muốn sửa: ");
        double editBasicSalary = inputBasicSalary.nextDouble();

        FulltimeEmployee editEmployeeFullTime = new FulltimeEmployee(editIdFullTime, editNameFullTime, editAgeFullTime, editPhoneFullTime, editEmailFullTime, editBonus, editFineMoney, editBasicSalary);
        return editEmployeeFullTime;
    }
    public static PartimeEmployee editPartTimeEmployee(){
        Scanner inputIdPartTime = new Scanner(System.in);
        System.out.println("Nhập lại ID nhân viên Part Time bạn muốn sửa: ");
        String editIdPartTime = inputIdPartTime.nextLine();

        Scanner inputNamePartTime = new Scanner(System.in);
        System.out.println("Nhập lại tên nhân viên Part Time bạn muốn sửa: ");
        String editNamePartTime = inputNamePartTime.nextLine();

        Scanner inputAgePartTime = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên Part Time bạn muốn sửa: ");
        int editAgePartTime = inputAgePartTime.nextInt();

        Scanner inputPhonePartTime = new Scanner(System.in);
        System.out.println("Nhập lại số điện thoại nhân viên Part Time bạn muốn sửa: ");
        String editPhonePartTime = inputPhonePartTime.nextLine();

        Scanner inputEmailPartTime = new Scanner(System.in);
        System.out.println("Nhập lại email nhân viên Part Time bạn muốn sửa: ");
        String editEmailPartTime = inputEmailPartTime.nextLine();

        Scanner inputWorkHourOfPartTime = new Scanner(System.in);
        System.out.println("Nhập lại số giờ làm việc nhân viên Part Time bạn muốn sửa: ");
        double editWorkHour = inputWorkHourOfPartTime.nextDouble();
        PartimeEmployee editPartTimeEmployee = new PartimeEmployee(editIdPartTime, editNamePartTime, editAgePartTime, editPhonePartTime, editEmailPartTime, editWorkHour);
        return editPartTimeEmployee;
    }
}