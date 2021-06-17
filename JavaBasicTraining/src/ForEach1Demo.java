/* Author: raja.kumar@stltech.in
 * Creation Date: 09/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */


import java.util.Scanner;
public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobjr=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=sobjr.nextInt();
		double []A=new double[size];
		System.out.println("Enter elements: ");
		
		for(int r=0;r<size;r++)
			A[r]=sobjr.nextDouble();
		System.out.println("\nEntered elements are: ");
		
		for(double a:A)
			System.out.println(a);
		
       float []B= {10.0f,20.2f,30.8f};
       System.out.println("\nB's Elements are: ");
       for(float a:B)
    	  System.out.println(a);
       
       System.out.print("\nEnter no. of flowers: ");
       int n=sobjr.nextInt();
       
       String[]flower=new String[n];
       sobjr.nextLine();
       for(int r=0;r<n;r++)
    	  flower[r]=sobjr.nextLine();
       
       System.out.println("\nEntered flowers are: ");
       for(String a:flower)
    	   System.out.println(a);
       
       System.out.print("\nEnter no. of countries: ");
       int len=sobjr.nextInt();
       String []country=new String[len];
       System.out.println("Enter countries name:");
       for(int r=0;r<len;r++)
    	   country[r]=sobjr.next();
       
       System.out.println("Enter countries are: ");
       for(String a: country)
    	   System.out.println(a);
       
	}

}
