package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		 // Create an instance of the Employee class
        Employee employee = new Employee("Ajay", 101, 500000.0);

        // Call methods on the Employee object
        employee.printName();
        employee.printSalary();
        
        
       

	}

}
/*
 * RESULT
 * Employee Name: Ajay
Employee Salary: 500000.0
 */
