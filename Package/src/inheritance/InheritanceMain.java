package inheritance;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;


public class InheritanceMain {
    public static void main(String[]args)
    {
    	Employee obj=new Employee (10,"Raghav sinha",29000.50);
    	
    	System.out.println("\nEmployee details: ");
    	 //((Manager)obj).display();
    	System.out.println("\n\n"+obj.toString());
    	
    	
    	
    	System.out.println("\n\nManager Details:");
    	Manager obj2=new Manager();
    	obj2.showIncentives();
    	System.out.println();
    	obj2.display();
    	System.out.println();
    	System.out.println("\n"+obj2.toString());
    	
    	
    	
    	
    	Manager obj3=new Manager(11,"Saurab singh",30000.00,15000.589);
    	System.out.println();
    	obj3.display();
    	System.out.println("\n\n"+obj3.toString());
    	
    	
    	
    	
    	System.out.println("\n\nWage of Employee:");
    	WageEmp obj4=new WageEmp();
    	System.out.println();
    	obj4.display();
    	System.out.println("\n\n"+obj4.toString());
    	
    	
    	
    	
    	WageEmp obj5=new WageEmp(20,"Shardul thakur",7,10000.00f);
    	System.out.println();
    	obj5.display();
    	System.out.println("\n\n"+obj5.toString());
    }
}
