
/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

class MathEngine {
	
	//This method returns the product of two integers
    int multiply(int a,int b)
    {
    	return a*b;
    }
    
    //This method showcase the output of three integers
    void multiply(int a,int b,int c)
    {
    	System.out.println("order2 Result is: "+(a*b*c));
    }
    
    //This method used to return float and integer values
    float multiply(float a, int b)
    {
    	return a*b;
    }
    
    //This method used to return integer and float values
    float multiply(int a,float b)
    {
    	return a*b;
    }
    
}

 public class OverloadTest
 {
	 public static void main(String[]args)
	 {
	 MathEngine obj1=new MathEngine();
	 System.out.println("order1 Result is: "+obj1.multiply(10,20));
	 obj1.multiply(20, 30,40);
	 System.out.println("order3 Result is: "+obj1.multiply(10.2f,20));
	 System.out.println("order4 Result is: "+obj1.multiply(10,20.0f));
	 
	 }
 }