package com.bridgelabs.functionalPrograms;

import com.bridgelabs.functional_util.Functional_Util;

public class Stop_Watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functional_Util.start();
		  // TimeUnit.SECONDS.sleep(4);
		Functional_Util.stop();
		
		
		System.out.println("elapsed time:"+Functional_Util.elapse());
		
			}
	}

