package com.variables;
/* File name: TutorialPoints.java*/
public class TutorialPoints_Salary extends TutorialPoints_Employee1 
{
	private double salary; //Annual salary
	public TutorialPoints_Salary(String name, String address, int number, double salary)
	{
		super(name, address, number);
		setSalary(salary);
	}
	public void setSalary(double newSalary)
	{
		if(newSalary>=0.0)
		{
			salary = newSalary;
			
		}
	
	}
	public void mailCheck()
	{
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing check to " + getName() +
		"with salary " + salary);
	}
	public double getSalary()
	{
		return salary;
	}
	 public double computePay()
	 {
		 System.out.println("Computing salary pay for " + getName());
		 return salary/52;
	 }
	
	

	
}
