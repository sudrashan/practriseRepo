package com.infy;

public class Factorail {
	
	
	public static void factorial(int n)
	{
		
		int fact=1;
		for(  int i=2;i<=n;i++)
		{			
			fact=fact*i;
		}
		
		
	}
	
	public static void main(String[] args) {
		int a=5;
		factorial(a);
	}

}
