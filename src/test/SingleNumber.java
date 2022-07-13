package test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SingleNumber {
	
	static int num;
	
	public static int singleNumber(int a [])
	{
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for (int x : a)
		{
			if (!hm.containsKey(x))
			{
				hm.put(x, 1);
				
			}
			else {
				hm.put(x, hm.get(x) + 1);
				
			}
			
		}
		

		
		hm.forEach((k,v) -> {
			if (v==1)
			{
				num = k;
				
			}
		});
		
		
		return num;
		
		
		
	
		
	}
	
	public static void main(String[] args) {
		int a [] = {4,1,2,1,2};
		System.out.println(singleNumber(a));
	}

}
