package com.phoenix.interfaces.main;
import com.phoenix.interfaces.*;
import com.phoenix.planets.*;
import com.phoenix.living.wild.Tiger;
import com.phoenix.living.Animal;
import com.phoenix.living.pet.Cat;
import com.phoenix.vehicles.cars.Car;
import com.phoenix.machines.HumanRobot;

/*
* Author: raja.kumar@stltech.in
* Creation Date: 16/06/2021
* Version: 3.0
* Copyright: Sterlite Technologies Ltd.
*/

public class InterfaceMain {
   public static void main(String[]args)
   {
	   Movable move;
	   System.out.println("Earth Details:===>");
	   move=new Earth();
	   ((Earth)move).setMoons(10);
	   System.out.println(((Earth)move).toString());
	   ((Earth)move).rotate();
	   ((Earth)move).move();
	   ((Earth)move).revolve();
	   ((Earth)move).supportsLife();
	 
	   System.out.println("\n\nJupiter Details:===>");
	   move=new Jupiter();
	   ((Jupiter)move).setMoons(20);
	   System.out.println(((Jupiter)move).toString());
	   ((Jupiter)move).move();
	   ((Jupiter)move).revolve();
	   ((Jupiter)move).rotate();
	   ((Jupiter)move).supportsLife();
	   
	   
	   System.out.println("\n\nTiger Details:===>");
	   Animal obj;
	   obj=new Tiger();
	   ((Tiger)obj).run();
	   ((Tiger)obj).jump();
	   ((Tiger)obj).walk();
	   
	   
	   System.out.println("\n\nCat Details:===>");
	   obj=new Cat();
	   ((Cat)obj).jump();
	   ((Cat)obj).run();
	   ((Cat)obj).walk();
	   
	   
	   System.out.println("\n\nCar Details:===>");
	   Car obj1=new Car();
	   ((Car)obj1).start();
	   ((Car)obj1).run();
	   ((Car)obj1).move();
	   ((Car)obj1).stop();
	 
	   
	   System.out.println("\n\nRobot Details:===>");
	   HumanRobot obj2=new HumanRobot();
	   ((HumanRobot)obj2).processData();
	   ((HumanRobot)obj2).senseInfo();
	   ((HumanRobot)obj2).useArtificialIntelligence();
	   ((HumanRobot)obj2).run();
	   ((HumanRobot)obj2).jump();
	   ((HumanRobot)obj2).move();
	   ((HumanRobot)obj2).walk();
	   
	   
   }
}
