package com.npn.practice;

public class GettersSetters 
{
public static void main(String[] args) 
{
	Employee empObj = new Employee();
	
	empObj.setEmpNumber(101);
	empObj.setEmpName("Ramesh");
	empObj.setEmpSalary(10000);
	
	System.out.println("Employee number::"+empObj.getEmpNumber());
	System.out.println("Employee name::"+empObj.getEmpName());
	System.out.println("Employee salary::"+empObj.getEmpSalary());
}
}

class Employee
{
	private int empNumber;
	private String empName;
	private double empSalary;
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}