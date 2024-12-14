package com.infy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	
	public static void  twoSum(int [] nums,int target)
	{
		 Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            int complement = target - nums[i];
	            if (map.containsKey(complement)) {
	               System.out.println(complement);
	               int z=nums[i];
	               System.out.println(z);
	            }
	            map.put(nums[i], i);
	        }
	       // throw new IllegalArgumentException("No two sum solution");
	    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] arr=	{2,7,11,15,5,4};
	int target=9;
	twoSum(arr, target);
	
	
	}

}
