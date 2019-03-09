
package com.bridgelabs.functionalPrograms;

import java.util.Scanner;

import com.bridgelabs.functional_util.Functional_Util;


public class CoinToss {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("put a value of flip coin ");
		int  flip = sc.nextInt();
		Functional_Util.flipcoin(flip);
			
	}
}



