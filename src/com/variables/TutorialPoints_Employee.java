package com.variables;

public class TutorialPoints_Employee 
{
	//this instance variable is visibe for any child class
	public String name;
	
	//salary variable is visible in employee class only
	private double salary;
	
	//The name variable is assigned in the constructor.
	
	public TutorialPoints_Employee (String empName)
	{
		name=empName;
		
	}
	//The salary variable is assigned a value.
	public double setSalary(double empSal)
	{
		salary = empSal;
		return salary;
	}
	
	//This methods prints the employee details.
	
	public void printEmp()
	{
		System.out.println("name : " + name);
		System.out.println("salary : " + salary);
	}
	
	public static void main(String[] args)
	
	{
		TutorialPoints_Employee empOne = new TutorialPoints_Employee("Ransika");
		  double eSal= empOne.setSalary(15000);
		System.out.println("eSal is " + eSal);
		empOne.printEmp();
	}
}
