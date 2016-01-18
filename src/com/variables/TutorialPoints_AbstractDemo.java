package com.variables;
/* File name :TurorialPoints_AbstractDemo.java       */
public class TutorialPoints_AbstractDemo
{
	public static void main(String[] args)
	{
		TutorialPoints_Salary tpsl = new TutorialPoints_Salary("Mohd Mohtashim ", "Ambehta, UP", 3, 3600.00);
				
		TutorialPoints_Employee1 tpel = new TutorialPoints_Salary("John Adams ", "Boston, MA ", 2, 2400.00);
		
		System.out.println("Call mailCheck using Salary reference --");
		tpsl.mailCheck();
		
		System.out.println("\n Call mailCheck using Employee reference --");
		tpel.mailCheck();
				
	}
}
