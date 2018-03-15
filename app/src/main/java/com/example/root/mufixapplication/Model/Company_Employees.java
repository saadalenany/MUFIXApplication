package com.example.root.mufixapplication.Model;

/**
 * Created by root on 18/02/18.
 */

public class Company_Employees {

    String company_id;
    String employee_id;
    String employee_position;
    int employee_salary;

    public Company_Employees(String company_id, String employee_id, String employee_position, int employee_salary) {
        this.company_id = company_id;
        this.employee_id = employee_id;
        this.employee_position = employee_position;
        this.employee_salary = employee_salary;
    }

    public Company_Employees() {

    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_position() {
        return employee_position;
    }

    public void setEmployee_position(String employee_position) {
        this.employee_position = employee_position;
    }

    public int getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(int employee_salary) {
        this.employee_salary = employee_salary;
    }

    @Override
    public String toString() {
        return "Company_Employees{" +
                "company_id='" + company_id + '\'' +
                ", employee_id='" + employee_id + '\'' +
                ", employee_position='" + employee_position + '\'' +
                ", employee_salary=" + employee_salary +
                '}';
    }
}
