package com.phoenix.planets;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
import com.phoenix.planets.Planet;
public class Jupiter extends Planet{
   
	//overridden abstract method with more visibility
		public void supportsLife()
		{
			System.out.println("Jupiter is ethereal...!");
		}
		
		
		//overridden interfaces method
		public void move()
		{
			System.out.println("Jupiter is Moving....!");
		}
		
		
		public void rotate()
		{
			System.out.println("Jupiter is Rotating....!");
		}
		
		
		public void revolve()
		{
			System.out.println("Jupiter is Revolving....!");
		}
		
}
