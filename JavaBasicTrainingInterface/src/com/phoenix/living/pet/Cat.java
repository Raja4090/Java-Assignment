package com.phoenix.living.pet;
import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
public class Cat extends Animal implements Walkable{
	
	 //overridden interfaces method
     public void run()
     {
    	 System.out.println("Cat is running....!");
     }
     
     public void jump()
     {
    	 System.out.println("Cat is Jumping....!");
     }
     
     public void walk()
     {
    	 System.out.println("Cat is Walking....!");
     }
}
