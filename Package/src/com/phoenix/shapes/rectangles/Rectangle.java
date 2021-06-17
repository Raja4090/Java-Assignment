package com.phoenix.shapes.rectangles;

/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

import com.phoenix.shapes.Shape;

public class Rectangle extends Shape{
	
	//private data members
	private int length,breadth;
	
	//default constructor
	public Rectangle()
	{
		length=100;
		breadth=200;
		
	}

	
	//parameterized constructor
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	
	//overridden method of shape class	
	public void calculateArea()
	 {
		 System.out.println("Area of Rectangle: "+(length*breadth));
	 }
	 
	 
	 public void calculatePerimeter()
	 {
		 System.out.println("Perimeter of Rectangle: "+(2*(length+breadth)));
	 }

}
