/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.Scanner;
class MyDateSG{
	// private data member
	private int day,month,year;
	
	//default constructor
	public MyDateSG()
	{
		day=month=1;
		year=2021;
	}
	
	//parameterize constructor
	public MyDateSG(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	// creating Scanner class object reference for user input
	Scanner sobjr=new Scanner(System.in);
	
	//setter method for day
	public void setDay()
	{
		System.out.print("Enter day: ");
		int day=sobjr.nextInt();
		this.day=day;
	}
	
	//setter method for month
	public void setMonth()
	{
		System.out.print("Enter month: ");
		int month=sobjr.nextInt();
		this.month=month;
	}
	
	//setter method for year
	public void setYear()
	{
		System.out.print("Enter Year: ");
		int year=sobjr.nextInt();
		this.year=year;
	}
	
	//getter method for day
	public int getDay()
	{
		return this.day;
	}
	
	//getter method for month
	public int getMonth()
	{
		return this.month;
	}
	
	//getter method for year
	public int getYear()
	{
		return this.year;
	}
	
	//printing details to the console
	public void printDate()
	{
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
	
}
public class DateMainSG {
	public static void main(String[]args)
	{
		MyDateSG obj1=new MyDateSG();
		obj1.setDay();
		obj1.setMonth();
		obj1.setYear();
		System.out.println("Day: "+obj1.getDay());
		System.out.println("Month: "+obj1.getMonth());
		System.out.println("Year: "+obj1.getYear());
		obj1.printDate();
		
		System.out.println("\n\n");
		
		MyDateSG obj2=new MyDateSG(10,6,2021);
		
		System.out.println("Day: "+obj2.getDay());
		System.out.println("Month: "+obj2.getMonth());
		System.out.println("Year: "+obj2.getYear());
		obj2.printDate();
		
		
		
	}

}
