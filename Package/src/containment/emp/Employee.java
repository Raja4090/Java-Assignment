/* Author: raja.kumar@stltech.in
 * Creation Date: 09/06/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

package containment.emp;
import containment.date.*;
public class Employee {
	
	//private data member
    private int empId;
    private String name;
    
   private MyDate birthDate;
   
   //default constructor
   public Employee()
   {
	   empId=1;
	   name="Raja Kumar";
	   birthDate =new MyDate();
   }
    
   //parameterized constructor
   public Employee(int empId,String name,MyDate birthDate)
   {
	   this.empId=empId;
	   this.name=name;
	   this.birthDate=birthDate;
   }
   //setter method for empId
   public void setEmpId(int empId)
   {
	   this.empId=empId;
   }
   
   //setter method for name
   public void setName(String name)
   {
	   this.name=name;
   }
   
   //setter method for date
   public void setBirthDate(MyDate birthDate)
   {
	   this.birthDate=birthDate;
   }
   
   //getter method for empid
   public int getEmpId()
   {
	   return empId;
   }
   
   //getter method for name
   public String getName()
   {
	   return name;
   }
   
   //getter method for date
   public MyDate getBirthDate()
   {
	   return birthDate;
   }
   
   //printing details to the console
   public void display()
   {
	   System.out.println("EmpId: "+empId+"\tName: "+name+"\t"+birthDate);
   }
   
   //returning details
   public String toString()
   {
	   return "EmpId: "+empId+"\tName:"+name+"\t"+birthDate;
   }
   
}
