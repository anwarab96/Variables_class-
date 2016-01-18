package com.variables;

public abstract class TutorialPoints_Employee1 
{
	private String name;
	private String address;
	private int number;
	double salary;
	
	public TutorialPoints_Employee1(String name, String address, int number)
	{
		System.out.println("Constructing an Employee");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public double computePay()
	{
		System.out.println("Inside Employee computePay ");
		double ysalary = (int)(12*number);
		return ysalary;
	}
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + this.name + 
				" " + this.address);
	} 
	public String toString()
	{
		return name + " "   + address + 
			" " + number;
	}
	public void setName(String newName)
	{
		name= newName;
	}
	public String getName()
	{
		return name;
	}
	 public String getAddress()
	 {
		 return address;
	 }
	 public void setAddress(String newAddress)
	 {
		 address = newAddress;
	 }
	 public void setNumber(int newNumber)
	 {
		 number = newNumber;
	 }
	 public int getNumber(int number)
	 {
		 return number;
	 }
	 public void setSalary(double newSalary)
	 {
		if(newSalary>0.0 )
		{
			salary = newSalary;
		}
	 }
	 
}
