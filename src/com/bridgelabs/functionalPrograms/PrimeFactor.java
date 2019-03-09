package com.bridgelabs.functionalPrograms;

import java.util.Scanner;

import com.bridgelabs.functional_util.Functional_Util;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a value");
		int n= sc.nextInt();
		 
		Functional_Util.factor(n);	
	}

	}


