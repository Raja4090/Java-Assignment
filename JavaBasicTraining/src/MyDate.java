/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */


public class MyDate {
	
	//data member
	private int day,month,year;
	
	//this function is used to initialize the data
	 public void initDate()
	 {
		 day=8;
		 month=6;
		 year=2021;
		 
	 }
	 
	 //updating date
	 public void setDate(int day,int month,int year)
	 {
		 this.day=day;
		 this.month=month;
		 this.year=year;
	 }
	 
	 //This function is used for displaying the data to console
	 public void printDate()
	 {
		 System.out.println("Date: "+day+"/"+month+"/"+year);
	 }
	 public static void main(String[]args)
	 {
		 //created object for MyDate class
		 MyDate obj=new MyDate();
		 obj.initDate();
		 obj.printDate();
	 }

}
