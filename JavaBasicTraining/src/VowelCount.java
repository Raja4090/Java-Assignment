/* Author: raja.kumar@stltech.in
 * Creation Date: 08/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */


import java.util.*;
public class VowelCount {
	
	//This function is used to accept string and returns the number of vowel exist
	public static int countVowel(String str)
	{
		int count=0;
		
		for(int r=0;r<str.length();r++)
		{
			if(str.charAt(r)=='a' || str.charAt(r)=='A'||str.charAt(r)=='e'||str.charAt(r)=='E'
			 ||str.charAt(r)=='i'||str.charAt(r)=='I'||str.charAt(r)=='o'||str.charAt(r)=='O'||str.charAt(r)=='u'
			 ||str.charAt(r)=='U')
				count++;
		}
		return count;
	}
	public static void main(String[]args)
	{
		Scanner sobjr=new Scanner(System.in);
		 String str=sobjr.nextLine();
		 System.out.println("Total vowel: "+countVowel(str));
	}

}
