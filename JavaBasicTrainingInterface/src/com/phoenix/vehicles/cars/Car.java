package com.phoenix.vehicles.cars;
import com.phoenix.vehicles.Vehicle;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
public class Car extends Vehicle implements Movable,Runnable{

	  //overridden super class method with more visibility
	  public void start()
	  {
		  System.out.println("Car is getting started....!");
	  }
	  
	  public void stop()
	  {
		  System.out.println("Car is getting stopped......!");
	  }
	  
	  
	  //overridden interfaces method
	  public void move()
	  {
		  System.out.println("Car is moving.....!");
	  }
	  
	  public void run()
	  {
		  System.out.println("Car is running faster....!");
	  }
}
