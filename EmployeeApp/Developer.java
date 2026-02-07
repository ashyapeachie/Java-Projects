/*
 *Author: Ashya
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
