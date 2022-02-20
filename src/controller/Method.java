package controller;

import model.Employee;
import model.FulltimeEmployee;
import model.PartimeEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    public static void displayEmployee(ArrayList<Employee> employees) {
        for (Employee e : employees
        ) {
            System.out.println(e);
        }
    }

    public static Employee creatNewFulltimeEmployee(ArrayList<Employee> employees) {
        Scanner inputIDFullTime = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên Full Time: ");
        String id = inputIDFullTime.nextLine();

        Scanner inputnameFullTime = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên Full Time: ");
        String name = inputnameFullTime.nextLine();

        Scanner inputAgeFullTime = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên Full Time: ");
        int age = inputAgeFullTime.nextInt();

        Scanner inputPhoneFullTime = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên Full Time: ");
        String phone = inputPhoneFullTime.nextLine();

        Scanner inputEmailFullTime = new Scanner(System.in);
        System.out.println("Nhập email nhân viên Full Time: ");
        String email = inputEmailFullTime.nextLine();

        Scanner inputBonus = new Scanner(System.in);
        System.out.println("Nhập số tiền thưởng: ");
        double bonus = inputBonus.nextDouble();

        Scanner inputFineMoney = new Scanner(System.in);
        System.out.println("Nhập số tiền phạt: ");
        double fineMoney = inputFineMoney.nextDouble();

        Scanner inputBasicSalary = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        double basicSalary = inputBasicSalary.nextDouble();

        Employee newEmployee = new FulltimeEmployee(id, name, age, phone, email, bonus, fineMoney, basicSalary);
        return newEmployee;
    }

    public static Employee creatNewParttimeEmployee(ArrayList<Employee> employees) {
        Scanner inputIDPartTime = new Scanner(System.in);
        System.out.println("Nhập ID nhân viên Part Time: ");
        String id = inputIDPartTime.nextLine();

        Scanner inputnameFullTime = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên Part Time: ");
        String name = inputnameFullTime.nextLine();

        Scanner inputAgeFullTime = new Scanner(System.in);
        System.out.println("Nhập tuổi nhân viên Part Time: ");
        int age = inputAgeFullTime.nextInt();

        Scanner inputPhoneFullTime = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên Part Time: ");
        String phone = inputPhoneFullTime.nextLine();

        Scanner inputEmailFullTime = new Scanner(System.in);
        System.out.println("Nhập email nhân viên Part Time: ");
        String email = inputEmailFullTime.nextLine();

        Scanner inputWorkHourOfPartTime = new Scanner(System.in);
        System.out.println("Nhập số giờ làm việc nhân viên Part Time : ");
        double WorkHour = inputWorkHourOfPartTime.nextDouble();

        Employee newEmployee = new PartimeEmployee(id, name, age, phone, email, WorkHour);
        return newEmployee;
    }

    public static void displaySalaryLowerAverageSalary(ArrayList<Employee> employees) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employees.size(); i++) {
            sum += employees.get(i).getNetSalary();
            count += 1;
        }
        double averageSalary = sum / count;
        System.out.println("Danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty :");
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof FulltimeEmployee) {
                if (employees.get(i).getNetSalary() < averageSalary) {
                    System.out.println(employees.get(i));
                }
            }
        }
    }

    public static double payrollForParttime(ArrayList<Employee> employees) {
        double sum = 0;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartimeEmployee) {
                sum += employees.get(i).getNetSalary();
            }
        }
        return sum;
    }

    public static ArrayList<Employee> sortSalaryFullTime(ArrayList<Employee> employees) {
                employees.sort((o1, o2) -> (int) (o1.getNetSalary()-o2.getNetSalary()));
        return employees;
    }
}
