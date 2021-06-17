/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

 class MyDateP {
	 //Private data member of the class
  private int day,month,year;
   
  // Default constructor is used to initialize the default values
  public MyDateP()
  {
	  day=8;
	  month=6;
	  year=2021;
  }
  
  //This constructor is used to update the values
  public MyDateP(int d,int m, int y)
  {
	  this.day=d;
	  this.month=m;
	  this.year=y;
  }
  
  //This method is used to show up the result
  public void printDetail()
  {
	  System.out.println("Date: "+day+"/"+month+"/"+year);
  }
}

public class DateMainP{
	public static void main(String[]args)
	{
		MyDateP obj1=new MyDateP();
		MyDateP obj2=new MyDateP(9,8,2021);
		obj1.printDetail();
		obj2.printDetail();
	}
}
