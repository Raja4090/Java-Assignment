package inheritance.emp;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class WageEmp extends Employee {
	
	//private data members
	private int noOfHours;
	private float ratePerHour;
	
	//default constructor
	public WageEmp()
	{
		noOfHours=8;
		ratePerHour=100.00f;
	}
	
	//parameterized constructor
	public WageEmp(int empId,String name,int hours,float rate)
	{
		super(empId,name);
		noOfHours=hours;
		ratePerHour=rate;
	}
	
	//public method to calculate Wage
	public void calculateWage()
	{
		System.out.println("\tWage: "+(noOfHours*ratePerHour));
	}
	
	//overridden display method and invoked super class method
	public void display()
	{
		super.display();
	}
	
	//public method to return details
	public String toString()
	{
		return super.toString();
	}

	
}
