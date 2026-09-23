package com.javaconstructors;

public class Employee {
	String name;
	int id;
	double salary;

	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Dedeepya", 101, 100000);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee ID: " + emp.id);
		System.out.println("Employee Salary: " + emp.salary);
	}

}
