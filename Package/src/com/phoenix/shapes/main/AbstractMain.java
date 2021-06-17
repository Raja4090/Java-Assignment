package com.phoenix.shapes.main;
import com.phoenix.shapes.Shape;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.rectangles.Rectangle;
import com.phoenix.shapes.squares.Square;
/* Author: raja.kumar@stltech.in
 * Creation Date: 12/06/2021
 * Version: 3.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class AbstractMain {
  public static void main(String[]args)
  {
	  
	  //created object ref for Shape class
	  Shape obj;
	  
	  //creating object and calling parameterized constructor
	  System.out.println("Circle Details\n");
	  obj=new Circle(12.4f);
	  obj.calculateArea();
	  obj.calculatePerimeter();
	  
	  
	  System.out.println("\n\nRectangle Details\n");
	  obj=new Rectangle(20,30);
	  obj.calculateArea();
	  obj.calculatePerimeter();
	  
	  
	  System.out.println("\n\nSquare Details\n");
	  obj=new Square(50);
	  obj.calculateArea();
	  obj.calculatePerimeter();
	  
  }
}
