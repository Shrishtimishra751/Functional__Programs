package com.bridgelabs.functionalPrograms;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabs.functional_util.Functional_Util;

public class Coupon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("put a number of coupons");
		int x= sc.nextInt();
		Functional_Util.coupon(x);
	}
	}

