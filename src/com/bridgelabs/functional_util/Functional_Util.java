package com.bridgelabs.functional_util;
import java.io.PrintWriter;
	import static java.lang.Math.*;
	import java.util.Random;

	@SuppressWarnings("unused")
	public class Functional_Util
	{

	

		public static void flipcoin(int flip)
		{
			int head=0;
			int tail=0;
			 int count=0;
			double randnum=0.0;
		while(count<flip)
		{
			randnum= Math.random();
			if(randnum<0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
			count++;
		}
		System.out.println("count the no of head"+head);
		System.out.println("count the no of tail"+tail);
		double headperc=(head*100)/flip;
		double tailperc=(tail*100)/flip;
		System.out.println("Head percentage"+headperc);
		System.out.println("Tail percentage"+tailperc);

		}
	


	//-----------------------------------------------------------------------------------------------------------------------------------//

	//REPLACE//

		public static void replace(String name) {
			// TODO Auto-generated method stub
			if(name.length()>=3)
			{
				System.out.print("Hiiiii "+ name + " How Are You");
			}
			else
				System.out.print("Not Correct");
		}
		


	//---------------------------------------------------------------------------------------------------------------------------------------//
	       //Harmonic//
		
		public static void harmonic(int n){
	float harmonic=1;
	{
		for (int i = 2; i <= n; i++) 
		{
			harmonic += (float)1 / i;
			
		}
		System.out.println("number is harmonic="+harmonic);
	}
	}


	//--------------------------------------------------------------------------------------//
	    //Power of 2//
		
		public static void powerOfTwo(int n)
	{
		int i=0;
		 int  power= 1;

		  if(n<31)
		    {
		    	while(i<=n)
		    	{
		    		 power=power*2;
		    		 System.out.println(power);
		    		 i++;
		    	}
		    }   
		  else
			  System.out.print("errors");
		    }


	//----------------------------------------------------------------------------------------//
	         //leap year//
		
	public static void leapyear(int year){
		
	if(year>1000)
	{

		 if((year % 400 == 0) || ((year % 4==0) && (year % 100 != 0)))

	   {
	       System.out.println("its a leap year");
	   }
		 else
			 System.out.println("its not a leap year");
	}
	else
	{
		     System.out.println("invalid year");
	}
	}
	//-------------------------------------------------------------------------------------//
	       //Factor//
	public static void factor(int n){
	for(int i=2; i<=n; i++)

	{
		if(n%i==0)
		{
			Isprime(i);
		}
	}
	}
	private static void Isprime(int i){
		int c=0;
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				c++;
				break;
			}
		}
		if(c==0)
		{
		System.out.println(i);

		}
	}

	//-----------------------------------------------------------------------------------------------//
	           //Gambler//

	public static void gambler(int money, int bet){
		Random r = new Random();
		int c=0;
		int w=0;
		int l=0;
		int max=60;
	    int min=0;
		int pr=r.nextInt((max-min)+1)+min;
		int sr=r.nextInt((max-min)+1)+min;
		while(money!=0)
		{
			if(pr>sr)
			{
				money=money+bet;
				w++;
			}
			if(sr>pr){
				money=money-bet;
				l++;
			}
			c++;
		}
			System.out.println("number of wins="+w);
			System.out.println("number of loss="+l);
			System.out.println("Total number of bet="+c);
			int wp=(w*100)/c;
			int lp=(l*100)/c;
			System.out.println("winner percentage"+wp);
			System.out.println("looses percentage"+lp);
		}


	//-----------------------------------------------------------------------------------------------------------------------------------//

	      //Two D Array//


	public static void arrayTwoD(int x, int  y, int arr[][])
	{
		PrintWriter pw=new PrintWriter(System.out,true);
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				pw.print(+arr[i][j]+" ");
			}
			pw.println();
		}
	}

	//--------------------------------------------------------------------------------------------------------------------------------//

	//Coupon//

	public static void coupon(int x){
	Random r= new Random();
	int y= r.nextInt(59);
	int count=0;
	for(int i=0; i<x; i++)
	{
		if(y!=r.nextInt(50))
		{
		count++;	
		}
		System.out.println(count);
	}
	}
	//----------------------------------------------------------------------------------------------------------------//


	//Distance//

	public static void distance(double x, double y){
		double d= Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("Distance" +d);
	}



	//------------------------------------------------------------------------------------------------//

	//Sum of 0//


	public static void SumOfZero(int array[], int x)
	{
		for(int i=0; i<x-2; i++)
		{
		for(int j=1;j<x-1; j++)	
		{
		for(int k=2; k<x; k++)
		{	
			if (array[i] +array[j]+array[k]==0)
		{
				System.out.println("Triplet are: "+array[i]+"," +array[j]+ "," +array[k]);
		}
		}
		}
		}
	}

		
	//-----------------------------------------------------------------------------------------------------------------------//
	//Quadratic//


	public static void quadratics(int a, int b, int c)
	{
		int delta  = b*b - 4*a*c;
		double x,y;

		if(delta>0)
		{
			 x = (-b + sqrt(delta))/(2*a);
		     y = (-b - sqrt(delta))/(2*a);
			System.out.println("roots are real and different");
			System.out.println("root1="+x+"  "+"root2=" +y);
		}
		else if(delta==0)
		{
			System.out.println("roots are real and same");
			System.out.println("root1=root2"+(-b/2*a));
		}
		else
		{
			 x = (-b + sqrt(-delta))/(2*a);
		     y = (-b - sqrt(-delta))/(2*a);
		     System.out.println("roots are complex");
				System.out.println("root1="+x+"  "+"root2=" +y);
		    
		}
		
	}


	//-------------------------------------------------------------------------------------------------------------------------//

	//StopWatch//
	static long start =0;
	static long stop=0;
	public static void start()
	{
		start=System.nanoTime();
		System.out.println(start);
	}
	public static void stop()
	{
		stop=System.nanoTime();
		System.out.println(stop);
	}
	public static long elapse()
	    
	{
		
		long diff=stop-start;
		return diff;
	}
	}