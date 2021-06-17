/* Author: raja.kumar@stltech.in
 * Creation Date: 09/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

import java.util.Scanner;
public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner sobjr=new Scanner(System.in);
       System.out.print("Enter number of rows:");
       int rows=sobjr.nextInt();
       
       System.out.print("Enter number of columns:");
       int cols=sobjr.nextInt();
       
       int [][]A=new int[rows][cols];
       System.out.println("Enter "+(rows*cols)+" elements:");
       for(int r=0;r<A.length;r++)
    	   for(int c=0;c<A[r].length;c++)
    		   A[r][c]=sobjr.nextInt();
       
       System.out.println("\nEntered elements are: ");
       for(int r=0;r<A.length;r++)
    	   for(int c=0;c<A[r].length;c++)
    		   System.out.println(A[r][c]);
       
       int [][]B= {{1,2,3,4},{5,6,7,8}};
       
       System.out.println("\nB's elements are: ");
       for(int r=0;r<B.length;r++)
    	   for(int c=0;c<B[r].length;c++)
    		   System.out.println(B[r][c]);
       
	}

}
