package com.phoenix.planets;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
public class Earth extends Planet {
        
	//overridden abstract method with more visibility
	public void supportsLife()
	{
		System.out.println("Earth is ethereal...!");
	}
	
	//overridden interfaces method
	public void move()
	{
		System.out.println("Earth is Moving....!");
	}
	
	public void rotate()
	{
		System.out.println("Earth is Rotating....!");
	}
	
	public void revolve()
	{
		System.out.println("Earth is Revolving....!");
	}
	
}
