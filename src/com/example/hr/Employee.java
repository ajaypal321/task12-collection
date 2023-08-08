package com.example.hr;

public class Employee {
// data members
	private String name;
    private int id;
    private double salary;
    
    // constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
 // Methods
    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    public void printSalary() {
        System.out.println("Employee Salary: " + salary);
    }
	public void raiseSalary(int i) {
		// TODO Auto-generated method stub
		
	}
}
