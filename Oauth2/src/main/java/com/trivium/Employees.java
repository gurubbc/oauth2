package com.trivium;

public class Employees {

	int empId;
	String employeeName;
	double employeeSalary;
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(int empId, String employeeName, double employeeSalary) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
