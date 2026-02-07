/*
 *Author: Ashya 
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
