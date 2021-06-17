package com.phoenix.machines;
import com.phoenix.interfaces.Movable;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
public class Robot implements Movable{
	
	//declared methods
	public void processData()
	{
		System.out.println("Processing functionality in Robot....!");
	}
	
	public void senseInfo()
	{
		System.out.println("Robot senses data....!");
	}
	
	public void useArtificialIntelligence()
	{
		System.out.println("Robot is embodiment for AI....!");
	}
	
	
	//overridden method of interface
	public void move()
	{
		System.out.println("Robot is moving....!");
	}

}
