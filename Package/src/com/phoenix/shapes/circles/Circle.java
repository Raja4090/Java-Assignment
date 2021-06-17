package com.phoenix.shapes.circles;

/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import com.phoenix.shapes.Shape;

public class Circle extends Shape {

	//Declared private data
	 private float radius;
	 
	 //default constructor
	 
	 public Circle()
	 {
		 radius=1.1f;
	 }
	 
	 
	 //parameterized constructor
	  public Circle(float radius)
	 {
		 this.radius=radius;
	 }
	 
	 //overridden abstract method
	 public void calculateArea()
	 { 
		 System.out.println("Area of Cirlce: "+(MATH_PI*radius*radius));
	 }
	 
	 
	 public void calculatePerimeter()
	 {
		 System.out.println("Perimeter of Cirlce: "+(MATH_PI*radius*2));
	 }
	 
}
