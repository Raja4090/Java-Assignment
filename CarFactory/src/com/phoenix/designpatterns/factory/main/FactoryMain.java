package com.phoenix.designpatterns.factory.main;
import com.phoenix.designpatterns.factory.cars.*;
import com.phoenix.designpatterns.factory.CarFactory;
import java.util.Scanner;
/* Author: raja.kumar@stltech.in
 * Creation Date: 17/06/2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class FactoryMain {
      public static void main(String[]args)
      {
    	  Scanner sobjr=new Scanner(System.in);
    	  System.out.print("Enter car Type: ");
    	  String str=sobjr.next();
    	  try
    	  {
    	  Car obj=CarFactory.getCar(str);
    	  obj.start();
    	  obj.run();
    	  obj.stop();
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("Invalid input");
    	  }
      }
}
