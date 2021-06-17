package com.phoenix.machines;
import com.phoenix.interfaces.Walkable;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
public class HumanRobot extends Robot implements Walkable{

	//overridden interfaces method
	public void walk()
	{
		System.out.println("Human Robot is walking...!");
	}
	
	public void jump()
	{
		System.out.println("Human Robot is Jumping...!");
	}
	
	public void run()
	{
		System.out.println("Human Robot is running...!");
	}
}
