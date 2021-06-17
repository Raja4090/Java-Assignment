/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

class MyDateC
{
	//data member
	int day,month,year;
	MyDateC()
	{
		day=8;
		month=6;
		year=2021;
	}
	
	//This function is used for displaying date
	public void printDate()
	{
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
	
}
public class MyDateMain {
	
	public static void main(String[]args)
	{
	   MyDateC obj=new MyDateC();
	   obj.printDate();
	}

}
