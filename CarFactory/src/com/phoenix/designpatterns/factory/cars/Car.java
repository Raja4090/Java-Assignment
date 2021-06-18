package com.phoenix.designpatterns.factory.cars;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class Car {

	//declared method
	public void start()
	{
		System.out.println("Car is getting started !");
	}
	
	public void run()
	{
		System.out.println("Car runs !");
	}
	
	public void stop()
	{
		System.out.println("Car is getting stopped !");
	}
}
