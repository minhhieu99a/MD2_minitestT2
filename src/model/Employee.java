package model;

public abstract class Employee {
    private String IdEmployee;
    private String FullnameEmloyee;
    private int AgeofEmplyee;
    private String PhoneNumberOfEmployee;
    private String EmailOfEmployee;

    public Employee() {
    }

    public abstract double getNetSalary();

    public Employee(String idEmployee, String fullnameEmloyee, int ageofEmplyee, String phoneNumberOfEmployee, String emailOfEmployee) {
        IdEmployee = idEmployee;
        FullnameEmloyee = fullnameEmloyee;
        AgeofEmplyee = ageofEmplyee;
        PhoneNumberOfEmployee = phoneNumberOfEmployee;
        EmailOfEmployee = emailOfEmployee;
    }

    public String getIdEmployee() {
        return IdEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        IdEmployee = idEmployee;
    }

    public String getFullnameEmloyee() {
        return FullnameEmloyee;
    }

    public void setFullnameEmloyee(String fullnameEmloyee) {
        FullnameEmloyee = fullnameEmloyee;
    }

    public int getAgeofEmplyee() {
        return AgeofEmplyee;
    }

    public void setAgeofEmplyee(int ageofEmplyee) {
        AgeofEmplyee = ageofEmplyee;
    }

    public String getPhoneNumberOfEmployee() {
        return PhoneNumberOfEmployee;
    }

    public void setPhoneNumberOfEmployee(String phoneNumberOfEmployee) {
        PhoneNumberOfEmployee = phoneNumberOfEmployee;
    }

    public String getEmailOfEmployee() {
        return EmailOfEmployee;
    }

    public void setEmailOfEmployee(String emailOfEmployee) {
        EmailOfEmployee = emailOfEmployee;
    }
}
