/*
 *Author: Ashya 
 *Filename: EmployeeApp.java
 *Description: This file, the main program, attempts to demonstrate polymorphism
 * by calling the override "displayInfo" method.
 */
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee[] employees = new Employee[2];
        // an array for Employee objects
        
        /* getting user input for Manager objects */
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter details for Manager: ");
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.println("Enter base salary: ");
            double baseSalary = scanner.nextDouble();
            
            System.out.println("Enter bonus: ");
            double bonus = scanner.nextDouble();
            scanner.nextLine();
            
            employees[i] = new Manager(name, baseSalary, bonus);
        }
        
        /* getting user input for Developer objects */
        for (int i = 1; i < 2; i++) {
            System.out.println("Enter details for Developer: ");
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.println("Enter base salary: ");
            double baseSalary = scanner.nextDouble();
            
            System.out.println("Enter overtime pay: ");
            double overtimePay = scanner.nextDouble();
            
            employees[i] = new Developer(name, baseSalary, overtimePay);
        }
        
        double totalSalary = 0;
        
        for (Employee employee : employees) {
            employee.displayInfo();
            totalSalary += employee.calculateSalary();
            System.out.println();
        }
        
        /* displays the total salary of all employees */
        System.out.println("Total Salary of all employees: " + totalSalary);
    }
}
