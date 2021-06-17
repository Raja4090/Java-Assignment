/* Author: raja.kumar@stltech.in
 * Creation Date: 09/06/2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

public class DateArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating array of objects
       MyDate []A=new MyDate[2];
       A[0]=new MyDate();
       A[0].setDate(10,6,2021);  // initialized data
       A[1]=new MyDate();
       A[1].setDate(11,6,2021);
       
       //printing details
       for(int r=0;r<A.length;r++)
    	   A[r].printDate();
      
  // without using new keyword , to initialize the data
       MyDate []B= {new MyDate(),new MyDate()};
        B[0].setDate(12, 6, 2021);
        B[1].setDate(13, 6, 2021);
        
        for(MyDate obj:B)
     	   obj.printDate();
	}

}
