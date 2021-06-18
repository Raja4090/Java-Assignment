package com.phoenix.designpatterns.factory;
import com.phoenix.designpatterns.factory.cars.*;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class CarFactory {

	//declared method
	public static Car getCar(String carType)
	{
		  if(carType.equals("Couple"))
			  return new CoupleCar();
		  
		  if(carType.equals("Luxury"))
			  return new LuxuryCar();
		  
		  if(carType.equals("Sedan"))
			  return new SedanCar();
		  
		  if(carType.equals("Sport"))
			  return new SportCar();
		  else
			  return null;
	}
}
