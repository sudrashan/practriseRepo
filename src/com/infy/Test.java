package com.infy;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.security.auth.callback.ConfirmationCallback;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={1,2,3,1,3,2,1};
		int target=5;
	Map<Integer, Integer> map=new HashMap<>();
	
		for ( int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+ arr[j]==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
					//System.out.println(arr[j]);
					map.put(arr[i], arr[j]);
			Set<Map.Entry<Integer, Integer>> list=map.entrySet().stream().distinct().collect(Collectors.toSet());
			System.out.println(list);
				}
			}
		}
	}

}
