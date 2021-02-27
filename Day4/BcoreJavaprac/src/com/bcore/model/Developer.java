package com.bcore.model;
//Sub class
public class Developer extends Employee {

	int noOfClasses;
	int noOfmethods;
	int noOflinesOfCode;

	public Developer(int id, String name, double sal, int ag, String depart, Address addr) {
		employeeId = id;
		employeeName = name;
		salary = sal;
		age = ag;
		department = depart;
		address = addr;
		noOfClasses = 10;
		noOfmethods = 100;
		noOflinesOfCode = 1000;
	}

	public void writeCode() {
		System.out.println("writes the code");
	}

	public void getDetails() {
		getEmployeeDetails();
		System.out.println(noOfClasses);
		System.out.println(noOfmethods);
		System.out.println(noOflinesOfCode);
	}

}
