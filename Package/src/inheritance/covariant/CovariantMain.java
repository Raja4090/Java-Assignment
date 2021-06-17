package inheritance.covariant;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import inheritance.emp.EmployeeData;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;


public class CovariantMain {
	public static void main(String[]args)
	{
		System.out.println("Employee Information\n");
		EmployeeData obj=new EmployeeData();
		System.out.println(obj.getEmployee().toString());
		
		
		System.out.println("\n\nManager Information:\n");
		ManagerData obj1=new ManagerData();
		obj1.getManager().display();
		obj1.getManager().showIncentives();
		
		
		System.out.println("\n\nWage Information:\n");
		WageEmpData obj2=new WageEmpData();
		obj2.getEmployee().display();
		obj2.getEmployee().calculateWage();
		
		
	}
	

}
