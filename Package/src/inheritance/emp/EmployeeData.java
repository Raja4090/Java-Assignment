package inheritance.emp;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class EmployeeData {

	//created public function as covariant return type
	public Employee getEmployee()
	{
		return new Employee();
	}
	
	

}
