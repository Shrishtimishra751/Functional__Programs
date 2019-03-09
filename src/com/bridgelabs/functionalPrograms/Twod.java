package com.bridgelabs.functionalPrograms;

import java.util.Scanner;

import com.bridgelabs.functional_util.Functional_Util;

public class Twod {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Rows");
		int x=sc.nextInt();
		System.out.println("Column");
		int y=sc.nextInt();
		int arr[][]=new int[x][y];
		for(int i=0; i<x; i++){
			for (int j=0 ;j<y; j++){
				System.out.println("put a value");
				arr[i][j]= sc.nextInt();
			}
		}
			Functional_Util.arrayTwoD(x, y, arr);
	}

}
