package inheritance;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.*;
public class InheritanceDTMain {
	public static void main(String[]args)
	{
		
		
		System.out.println("Manager Details:\n");
		Employee obj=new Manager(101,"Roy",25000.89,15000.45);
		((Manager)obj).display();
		System.out.println("\n");
		((Manager)obj).showIncentives();
		
		
		System.out.println("\nWage Details:\n");
		Employee obj1=new WageEmp(201,"Surya",9,10000.56f);
		((WageEmp)obj1).display();
		 System.out.println("\n\n"+((WageEmp)obj1).toString());
		 System.out.println();
		 ((WageEmp)obj1).calculateWage();
		 
		 
	}

}
