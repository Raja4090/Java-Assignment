package inheritance.emp.wage;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
public class WageEmpData extends EmployeeData{
	
	//created public method as covarient return type.
	public WageEmp getEmployee()
	{
		return new WageEmp();
	}

}
