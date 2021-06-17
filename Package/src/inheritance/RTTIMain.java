package inheritance;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import inheritance.emp.Employee;
import inheritance.emp.mgr.Manager;
import inheritance.emp.WageEmp;
public class RTTIMain {
	
	//creating member function for checking object reference
	public static void showEmpInfo(Employee emp)
	{
		if(emp instanceof Manager)
		{
			((Manager) emp).display();
		   ((Manager)emp).showIncentives();
		}
		
		if(emp instanceof WageEmp)
		{
			((WageEmp) emp).display();
			((WageEmp)emp).calculateWage();
		}
	}
	
	
	public static void main(String []args)
	{
	   System.out.println("Manager details:\n");
	   Manager obj=new Manager(104,"newton",50000.00,25000.00);
	     showEmpInfo(obj);
	     
	     
	   System.out.println("\n\nWage Details:\n");
	   WageEmp obj1=new WageEmp(110,"What",7,200.00f);
	     showEmpInfo(obj1);     
	}

}
