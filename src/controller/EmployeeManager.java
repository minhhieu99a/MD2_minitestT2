package controller;

import model.Employee;
import model.FulltimeEmployee;
import model.PartimeEmployee;
import storage.EmployeeFromFileBinary;
import storage.IEmployeeData;
import view.Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static view.Client.*;

public class EmployeeManager {
    private static IEmployeeData employeeData = new EmployeeFromFileBinary();
    public static ArrayList<Employee> employeeList = employeeData.readFile();

    public static void displayEmployee() {
        for (Employee e : employeeList
        ) {
            System.out.println(e);
        }
    }


    public static void addNewFulltimeEmployee() {
        FulltimeEmployee fullTimeEmployee = creatNewFulltimeEmployee();
        employeeList.add(fullTimeEmployee);
        try {
            employeeData.writeFile(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addNewParttimeEmployee() {
        PartimeEmployee partTimeEmployee = creatNewParttimeEmployee();
        employeeList.add(partTimeEmployee);
        try {
            employeeData.writeFile(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void displaySalaryLowerAverageSalary() {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            sum += employeeList.get(i).getNetSalary();
            count += 1;
        }
        double averageSalary = sum / count;
        System.out.println("Danh sách nhân viên toàn thời gian có mức lương thấp hơn mức lương trung bình của các nhân viên trong công ty :");
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) instanceof FulltimeEmployee) {
                if (employeeList.get(i).getNetSalary() < averageSalary) {
                    System.out.println(employeeList.get(i));
                }
            }
        }
    }

    public static double payrollForParttime() {
        double sum = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) instanceof PartimeEmployee) {
                sum += employeeList.get(i).getNetSalary();
            }
        }
        return sum;
    }

    public static List<Employee> sortSalaryFullTime() {
        employeeList.sort((o1, o2) -> (int) (o1.getNetSalary() - o2.getNetSalary()));
        return employeeList;
    }

    public static void editEmployeeById() {
        int index = getEmployeeById();
        if (employeeList.get(index) instanceof FulltimeEmployee) {
           FulltimeEmployee fulltimeEmployee= editFulltimeEmployee();
           employeeList.set(index,fulltimeEmployee);
        } else {
            PartimeEmployee partimeEmployee = editPartTimeEmployee();
            employeeList.set(index,partimeEmployee);
        }
        try {
            employeeData.writeFile(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
