/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */


package containment.date;

public class MyDate {
	//declared private data member
	private int day,month,year;
	
	//default constructor
	public MyDate()
	{
		day=10;
		month=6;
		year=2021;
	}
	
	//parameterized constructor
	public MyDate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	//setter method for day
	public void setDay(int day)
	{
		this.day=day;
	}
	
	//setter method for month
	
	public void setMonth(int month)
	{
		this.month=month;
	}
	
	//setter method for year
	public void setYear(int year)
	{
		this.year=year;
	}
	
	//getter method for day
	public int getDay()
	{
		return day;
	}
	//getter method for month
	public int getMonth()
	{
		return month;
	}
	
	//getter method for year
	public int getYear()
	{
		return year;
	}
	
	//printing details
	public void printDate()
	{
		System.out.println("Date: "+day+"/"+month+"/"+year);
	}
	
	//returning details
	public String toString()
	{
		return "Date: "+day+"/"+month+"/"+year;
	}

}
