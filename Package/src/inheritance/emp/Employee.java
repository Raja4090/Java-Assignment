package inheritance.emp;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class Employee {
	
	//private data members
	private int empId;
	private String name;
	private double salary=210000.00;
	
	
	//default constructor
	public Employee()
	{
		empId=1;
		name="Raja Kumar";
		salary=24000.00;
	}
	
	
	//parameterized constructor
	public Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	
	
	
	
	public Employee(int empId,String name, double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	//protected member function
	protected void display()
	{
		System.out.print("EmpId: "+empId+"\tName: "+name+"\tSalary:"+salary);
	}
	
	
    //public function to return details
	public String toString()
	{
		return "Name: "+name+"\tSalary: "+salary+"\tEmpId: "+empId;
	}
}
