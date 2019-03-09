package com.bridgelabs.functionalPrograms;

import java.util.Scanner;

import com.bridgelabs.functional_util.Functional_Util;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		System.out.println("put a money");
		int money= sc.nextInt();
		System.out.println("put a bet money");
		int bet= sc.nextInt();
		
		Functional_Util.gambler(money,bet);	

			}

}
