package com.phoenix.living.wild;
import com.phoenix.living.Animal;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
import com.phoenix.interfaces.Walkable;
public class Tiger extends Animal implements Walkable {
	
	//overridden walk method
	 public void walk()
	 {
		 System.out.println("Tiger is Walking....!");
	 }
	 
	 //overridden jump method
	 public void jump()
	 {
		 System.out.println("Tiger is Jumping....!");
	 }
	 
	 //overridden run method
	 public void run()
	 {
		 System.out.println("Tiger is running....!");
	 }

}
