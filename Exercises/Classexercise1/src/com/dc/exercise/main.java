package com.dc.exercise;
import java.util.Scanner;

public class main {
    private static final int MAX_EMPLOYEES= 5;
    private static Employee[] employees = new Employee[MAX_EMPLOYEES];
    private static int employeeCount = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEmployee Payroll System");
            System.out.println("1. Add Employee");
            System.out.println("2. View all employees");
            System.out.println("3. Search employee by ID");
            System.out.println("4. Update employee salary");
            System.out.println("5 Exit");
            System.out.println("Enter your choice: ");
            int choice= scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployeeById();
                    break;
                case 4:
                    updateEmployeeSalary();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addEmployee() {
        if (employeeCount >= MAX_EMPLOYEES) {
            System.out.println("Employee list is full!");
            return;
        }

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter Tax Rate (as decimal, 0.10 for 10%): ");
        double taxRate = scanner.nextDouble();

        employees[employeeCount++] = new Employee(id, name, department, salary, taxRate);
        System.out.println("Employee added successfully!");
    }

    private static void viewEmployees() {
        if (employeeCount == 0) {
            System.out.println("No employees found.");
        } else {
            for (int i = 0; i < employeeCount; i++) {
                employees[i].displayEmployee();
            }
        }
    }

    private static void searchEmployeeById() {
        System.out.print("Enter Employee ID to search: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getUserId() == id) {
                employees[i].displayEmployee();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void updateEmployeeSalary() {
        System.out.print("Enter Employee ID to update salary: ");
        int id = scanner.nextInt();
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getUserId() == id) {
                System.out.print("Enter new salary: ");
                double newSalary = scanner.nextDouble();
                employees[i].setSalary(newSalary);
                System.out.println("Salary updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
