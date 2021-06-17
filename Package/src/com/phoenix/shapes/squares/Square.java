package com.phoenix.shapes.squares;

/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import com.phoenix.shapes.Shape;
public class Square extends Shape {
	
	  //Private data member
      private int side;
      
      //default constructor 
      public Square()
      {
    	  side=10;
      }
      
      
      //parameterized constructor
      public Square(int side)
      {
    	  this.side=side;
      }
      
      
      //overridden method of shape class
     public void calculateArea()
 	 { 
 		 System.out.println("Area of Square: "+(side*side));
 	 }
 	 
 	 
 	 public void calculatePerimeter()
 	 {
 		 System.out.println("Perimeter of Square: "+(4*side));
 	 }

      
   
}
