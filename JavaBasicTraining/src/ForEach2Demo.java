/* Author: raja.kumar@stltech.in
 * Creation Date: 9/06/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.Scanner;
public class ForEach2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner class is used for user input
		Scanner sobjr=new Scanner(System.in);
	       System.out.print("Enter number of rows:");
	       int rows=sobjr.nextInt();
	       
	       System.out.print("Enter number of columns:");
	       int cols=sobjr.nextInt();
	       
	       // declared 2D Arrays
	       int [][]A=new int[rows][cols];
	       System.out.println("Enter "+(rows*cols)+" elements:");
	       
	       //Accepting User input for Array
	       for(int r=0;r<A.length;r++)
	    	   for(int c=0;c<A[r].length;c++)
	    		   A[r][c]=sobjr.nextInt();
	       
	       System.out.println("\nEntered elements are: ");
	      
	       // Printing details
	           for(int a[]:A)
	        	   for(int b:a)
	    		   System.out.println(b);
	       
	           //statically initialized elements for 2D Arrays
	       int [][]B= {{1,2,3,4},{5,6,7,8}};
	       
	       System.out.println("\nB's elements are: ");
	       
	       //Print Details
	       for(int a[]:B)
        	   for(int b:a)
    		   System.out.println(b);
	       
	}

}
