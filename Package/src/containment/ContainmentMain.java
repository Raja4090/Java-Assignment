/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */


package containment;

import containment.date.*;
import containment.emp.*;

public class ContainmentMain {
   public static void main(String[]args)
   {
	   Employee obj=new Employee();
	   
	   obj.setEmpId(101);
	   obj.setName("Roshan sharma");
	   obj.setBirthDate(new MyDate(6,5,1999));
	   
	   System.out.println("EmpId: "+obj.getEmpId());
	   System.out.println("Name: "+obj.getName());
	   System.out.println(obj.getBirthDate());
	   
	   System.out.println();
	   
	   System.out.println(obj.toString());
	   
	   System.out.println();
	   
	   Employee obj1=new Employee(102,"Hrithik Roshan",new MyDate(12,8,1975));
	   obj1.display();
   }
}
