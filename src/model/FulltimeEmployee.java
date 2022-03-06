package model;

import model.Employee;

import java.io.Serializable;

public class FulltimeEmployee extends Employee {
    private double Bonus;
    private double Fine;
    private double BasicSalary;

    @Override
    public double getNetSalary() {
        double result = BasicSalary + Bonus-Fine;
        return result;
    }

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(double bonus, double fine, double basicSalary) {
        Bonus = bonus;
        Fine = fine;
        BasicSalary = basicSalary;
    }

    public FulltimeEmployee(String idEmployee, String fullnameEmloyee, int ageofEmplyee, String phoneNumberOfEmployee, String emailOfEmployee, double bonus, double fine, double basicSalary) {
        super(idEmployee, fullnameEmloyee, ageofEmplyee, phoneNumberOfEmployee, emailOfEmployee);
        Bonus = bonus;
        Fine = fine;
        BasicSalary = basicSalary;
    }

    public double getBonus() {

        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public double getFine() {
        return Fine;
    }

    public void setFine(double fine) {
        Fine = fine;
    }

    public double getBasicSalary() {
        return BasicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        BasicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "IdEmployee="+getIdEmployee()+
                ";FullnameEmloyee="+getFullnameEmloyee()+
                ";AgeofEmplyee="+getAgeofEmplyee()+
                ";PhoneNumberOfEmployee="+getPhoneNumberOfEmployee()+
                ";EmailOfEmployee="+getEmailOfEmployee() +
                ";Bouns="+getBonus()+
                ";Fine="+getFine()+
                ";BasicSalary="+getBasicSalary()+
                "NetSalary="+getNetSalary()+
                '}';
    }
}
