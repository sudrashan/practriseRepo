package com.infy;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;
//inp
public class Collection {
	  public static  boolean isprime(int n)
	  {
		  if(n==1)
		  {
			  return true;
		  }
		  
		  if(n%2==0)
		  {
			  return false;
		  }else 
		  {
			  return true;
		  }
	  }
	
	public static void main(String[] args) {
		
 
   
    int n=6;
   System.out.print(isprime(n));
   
}
}