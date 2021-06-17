/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[]raja)
	{
		Scanner sobjr=new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size=sobjr.nextInt();
		
		int []A=new int[size];
		
		for(int r=0;r<A.length;r++)
			A[r]=sobjr.nextInt();

		System.out.println("\nEntered elements are: ");
		
		for(int r=0;r<A.length;r++)
			System.out.println(A[r]);
		
		int []B= {100,200,300};
		
		System.out.println("\nB's elements are: ");
		
		for(int r=0;r<B.length;r++)
			System.out.println(B[r]);
		
		System.out.print("\nEnter number of city: ");
		int n=sobjr.nextInt();
		
		String []city=new String[n];
		sobjr.nextLine();
		
		for(int r=0;r<city.length;r++)
		 city[r]=sobjr.nextLine();
		
		System.out.println("\nEntered cities are: ");
		
		for(int r=0;r<city.length;r++)
			System.out.println(city[r]);
		
		System.out.print("\nEnter number of total hobbies: ");
		int h=sobjr.nextInt();
		
		String []hobby=new String[h];
		
		for(int r=0;r<hobby.length;r++)
		 hobby[r]=sobjr.next();
		
		System.out.println("\nEntered hobbies are: ");
		
		for(int r=0;r<hobby.length;r++)
			System.out.println(hobby[r]);
		
	}
}
