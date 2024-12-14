package com.infy;

import java.lang.System.Logger;

public class Example2 {
	
	public static void isPalindrome(String str)
	{
		String newString="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			newString=newString+str.charAt(i);
			
		}
	if(str.equals(newString))
	{
		System.out.print("Palindrome");
	}else 
	{
		System.out.print("not palindrome");
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String string="jaaj";
     isPalindrome(string);
	}

}
