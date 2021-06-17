/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// importing Scanner class for user input
import java.util.Scanner;

public class Palindrome {
	
	//This function is used for returning result after checking the string is palindrome or not
	public static boolean checkPalindrome(String str)
	{
		String rev="";
		for(int r=str.length()-1;r>=0;r--)
			rev+=str.charAt(r);
		
		if(rev.contains(str))
		return true;
		else
			return false;
	}
	
	public static void main(String[]args)
	{
		Scanner sobjr=new Scanner(System.in);
		
		String str=sobjr.nextLine();
	    if(checkPalindrome(str))
	    	System.out.println("String is Palindrome");
	    else
	    	System.out.println("Not Palindrome");
	}

}
