package inheritance.emp.mgr;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */
import inheritance.emp.EmployeeData;

public class ManagerData extends EmployeeData {
	
	//created public method as covariant return type
     public Manager getManager()
     {
    	 return new Manager();
     }
}
