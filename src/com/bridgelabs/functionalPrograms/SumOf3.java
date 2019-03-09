package com.bridgelabs.functionalPrograms;

import java.util.Scanner;

import com.bridgelabs.functional_util.Functional_Util;

public class SumOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		 System.out.println("Enter array ");
		 int x= sc.nextInt();
		 int arr[]= new int[x];
		 for(int i=0; i<x; i++)
		 {
			 System.out.println("Enter a values");
			 arr[i]= sc.nextInt();
			
		 }
		 Functional_Util.SumOfZero(arr, x);
	}

}
