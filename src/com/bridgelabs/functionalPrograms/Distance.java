package com.bridgelabs.functionalPrograms;

import com.bridgelabs.functional_util.Functional_Util;

public class Distance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
  
   System.out.println("Enter value of x="+x);
   System.out.println("Enter value of y="+y);
   
   Functional_Util.distance(x, y);
	}


}
