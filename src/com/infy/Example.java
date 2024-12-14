package com.infy;

public class Example {
    public static void ispalindrome(int n)
    
    {
    	int a=n;
    	int rem=0;
    	int reverse=0;
    while 	(n>0)
    		{
    		rem=n%10;
    	   reverse=reverse*10+rem;
    		n=n/10;
    			
    		}
    
   if(reverse==a)
   {
	   System.out.print("palindrome");
   }else {
	System.out.print("not palindrome");
}
    }
	public static void main(String[] args) {
		int n=123;
	

  ispalindrome(n);

  //System.out.print(sum);
  }
	}


