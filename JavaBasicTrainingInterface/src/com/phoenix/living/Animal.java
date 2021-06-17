package com.phoenix.living;
import com.phoenix.interfaces.Movable;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
public abstract class Animal implements Movable{
	
	  //implementing move method
	  public void move()
	  {
		  System.out.println("Animal is moving....!");
	  }

}
