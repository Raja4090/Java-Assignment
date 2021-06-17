/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

class Account
{
	//private data member
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	
	//private static data members
	
	private static float interestRate;
	private static int count;
	
	//static block for updating interestRate
	static {
		interestRate=0.05f;
	}
	
	//default constructor
	public Account()
	{
		accNo=202020;
		ownerName="Raja Kumar";
		balance=25000.00;
		durationYears=1.5f;
		count++;
	}
	
	//parameterized constructor
	public Account(int accNo,String ownerName,double balance,float durationYears)
	{
		this.accNo=accNo;
		this.ownerName=ownerName;
		this.balance=balance;
		this.durationYears=durationYears;
		count++;
	}
	
	//setter method for AccNo
	public void setAccountNumber(int accNo)
	{  
		this.accNo=accNo;
	}
	
	//setter method for Name
	public void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}
	
	//setter method for balance
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	//setter method for durationYears
	public void setDurationYears(float durationYears)
	{
		this.durationYears=durationYears;
	}
	
	//getter method for accNo
	public int getAccNo()
	{
		return this.accNo;
	}
	
	//getter method for Name
	public String getOwnerName()
	{
		return this.ownerName;
	}
	//getter method for balance
	public double getBalance()
	{
		return this.balance;
	}
	
	//getter method for durationYears
	public float getDurationYears()
	{
		return this.durationYears;
	}
	
	//setter method for interestRate
	
	public static void setInterestRate(float interestRate)
	{
		 Account.interestRate=interestRate;
	}
	
	//getter method for interestRate
	public static float getInterestRate()
	{
		return interestRate;
	}
	
	//getter method for count
	
	public static int getCount()
	{
		return count;
	}
	
	//calculating simple interest
	public void calculateInterest()
	{
		System.out.println("Simple Interest: "+(balance*durationYears*interestRate));
	}
	
	//printing  details to the console
	public void printDetails()
	{
		System.out.println("Acc No: "+accNo+"\n Name: "+ownerName+"\nBalance: "+
	                     balance+"\nDuration: "+durationYears);
	}
	
	
	
	
}
public class Bank {
	public static void main(String[]args)
	{
		System.out.println("InterestRate: "+Account.getInterestRate());
		Account obj1=new Account();
		obj1.setAccountNumber(1020304);
		obj1.setOwnerName("Rohan Sharma");
		obj1.setBalance(34567.345);
		obj1.setDurationYears(3.5f);
		
		System.out.println("Acc No: "+obj1.getAccNo());
		System.out.println("Name: "+obj1.getOwnerName());
		System.out.println("Balance: "+obj1.getBalance());
		System.out.println("Interest Rate: "+obj1.getInterestRate());
		
		System.out.println("\n\n");
		Account obj2=new Account(110100,"Rajesh sharma",27000.045,2.5f);
		obj2.printDetails();
		
		obj2.calculateInterest();
		System.out.println("Total Objects: "+Account.getCount());
	}

}
