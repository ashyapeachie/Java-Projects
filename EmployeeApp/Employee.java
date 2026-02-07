/*
 *Author: Ashya 
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
