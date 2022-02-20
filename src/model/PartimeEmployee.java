package model;

public class PartimeEmployee extends Employee {
    private double WorkHour;

    @Override
    public double getNetSalary() {
        double result = WorkHour*100000;
        return result;
    }

    public PartimeEmployee() {
    }

    public PartimeEmployee(double workHour) {
        WorkHour = workHour;
    }

    public PartimeEmployee(String idEmployee, String fullnameEmloyee, int ageofEmplyee, String phoneNumberOfEmployee, String emailOfEmployee, double workHour) {
        super(idEmployee, fullnameEmloyee, ageofEmplyee, phoneNumberOfEmployee, emailOfEmployee);
        WorkHour = workHour;
    }

    public double getWorkHour() {
        return WorkHour;
    }

    public void setWorkHour(double workHour) {
        WorkHour = workHour;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "IdEmployee="+getIdEmployee()+
                ";FullnameEmloyee="+getFullnameEmloyee()+
                ";AgeofEmplyee="+getAgeofEmplyee()+
                ";PhoneNumberOfEmployee"+getPhoneNumberOfEmployee()+
                ";EmailOfEmployee"+getEmailOfEmployee()+
                ";WorkHour=" + getWorkHour() +
                ";NetSalary="+getNetSalary()+
                '}';
    }
}
