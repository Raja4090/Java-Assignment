/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
class MyDateT{
	
	//private data members
	private int day,month,year;
	
	//default constructor
	public MyDateT()
	{
		day=month=1;
		year=2021;
	}
	
	//parameterized constructor
	
	public MyDateT(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	//printing the details to the console
	public void printDate()
	{
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
}

public class DateMainT {
	public static void main(String[]args)
	{
		MyDateT obj1=new MyDateT();
		MyDateT obj2=new MyDateT(9,6,2021);
		obj1.printDate();
		obj2.printDate();
		
	}

}
