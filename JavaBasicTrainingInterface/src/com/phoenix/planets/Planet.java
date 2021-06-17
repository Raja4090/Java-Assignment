package com.phoenix.planets;
import com.phoenix.interfaces.Movable;
/*
*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/
import com.phoenix.interfaces.Rotatable;
import com.phoenix.interfaces.Revolvable;
 public abstract class Planet implements Movable,Rotatable,Revolvable {
	   
	   //Declared private data members
	   private int noOfMoons;
       
	   //setter method
	   public void setMoons(int noOfMoons)
	   {
		   this.noOfMoons=noOfMoons;
	   }
	   
	   //getter method
	   
	   public int getMoons()
	   {
		   return noOfMoons;
	   }
	   
	   //declared protected abstract method
	   protected abstract void supportsLife();
	   
	   
	   //returns noOfMonns
	   public String toString()
	   {
		   return "Total moons: "+noOfMoons;
	   }
	  
}
 
 
