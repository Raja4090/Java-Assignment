/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class VarArgDemo {

	//this method accepts the integer value and returns the average value
	public static double average(int ...n)
	{
		double val=0.0;
		for(int a:n)
			val+=a;
		 val/=n.length;
		return val;
	}
	
	public static void main(String[]raja)
	{
		System.out.println("Average is: "+average(1,2,3));
	}
}

