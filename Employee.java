//Write a program to read an employee's data (name, gross salary and tax).  
//Then show the employee's data (name and net salary).  
//Then increase the employee's salary based on a given percentage (only the gross salary is affected by the percentage) and show the employee's data again.  
//Use the class. 

import java.util.Scanner;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getNetSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    public static void main(String[] args) {
        Scanner oli = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String name = oli.nextLine();

        System.out.print("Enter the gross salary: ");
        double grossSalary = oli.nextDouble();

        System.out.print("Enter the tax: ");
        double tax = oli.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);

        System.out.println("Employee: " + employee.getName() + ", Net salary: $" + employee.getNetSalary());

        System.out.print("Enter the percentage to increase the salary: ");
        double percentage = oli.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.getName() + ", Net salary: $" + employee.getNetSalary());

        oli.close();
    }
}
