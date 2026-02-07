*
 *Author: Ashya Hamer
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

/*
 *Author: Ashya Hamer
 *Filename: Employee.java
 *Description: Base file for the program.
 */

public class Employee {
    public String name;
    public double baseSalary;
    
    /* constructor */
    public Employee (String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    /* methods */
    public double calculateSalary() {
        return baseSalary;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

/*
 *Author: Ashya Hamer
 *Filename: Manager.java
 *Description: Class is derived from the Employee base class adding a specified property.
 */

public class Manager extends Employee {
    private double bonus;
    
    /* constructor initalizing */
    public Manager (String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    
    /* overrides */
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
    @Override
    public void displayInfo() {
        System.out.println("Manager's Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
    // displaying manager specific properties
}

/*
 *Author: Ashya Hamer
 *Filename: Developer.java
 *Description: Class is derived from the Employee base class adding a specified property.
 */

public class Developer extends Employee {
    private double overtimePay;
    
    /* constructor initializing */
    public Developer (String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }
    
    /* overrides */
    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
    @Override
    public void displayInfo() {
        System.out.println("Developer's Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Overtime Pay: " + overtimePay);
        System.out.println("Total Salary: " + calculateSalary());
    }
    // displays developer specific properties 
}