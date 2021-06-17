package inheritance.emp.mgr;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */
import inheritance.emp.*;

public class Manager extends Employee {
	
	//private data members
	private double incentives;
	
	//default constructor
	public Manager()
	{
		incentives=20000.00;
	}
	
	//parameterized constructor
	public Manager(int empId,String name,double salary,double incentives)
	{
		super(empId,name,salary);
		this.incentives=incentives;
		
	}
	
	//public method to show incentives
	public void showIncentives()
	{
		System.out.println("\tIncentives: "+incentives);
	}
	
	//overridden display method
	public void display()
	{
		super.display();
	}
	
	//overridden method
	public String toString()
	{
		return super.toString();
	}

}
