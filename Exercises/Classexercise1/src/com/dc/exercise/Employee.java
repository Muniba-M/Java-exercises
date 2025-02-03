package com.dc.exercise;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Employee {

    private int userId;
    private String userName;
    private String department;
    private double salary;
    private double taxRate;

    //Constructors
    public Employee(int userId, String userName, String department, double salary, double taxRate) {
        this.userId = userId;
        this.userName = userName;
        this.department = department;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    //default constructor
    public Employee() { }

    //getters
    public int getUserId() {return userId;}
    public String getUserName() {return userName;}
    public String getDepartment() {return department;}
    public double getSalary() {return salary;}
    public double getTaxRate() {return taxRate;}

    //setters
    public void setSalary (double salary) {this.salary = salary;}

    public double calculateNetSalary() {
        return salary - (salary * taxRate);
    }

    public void displayEmployee() {
        System.out.println("ID:" + userId + "Name:" + userName +
                "Department:" + department + "Salary:" + salary +
                "Tax Rate:" + (taxRate * 100) + "%, Net Salary: " + calculateNetSalary());
    }

}