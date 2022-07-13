package test3;

import java.util.HashMap;

public class TwoSum {
	
	
	public static int[] twoSum(int arr [], int target)
	{
		int x [] = new int[2];
		HashMap<Integer,Integer> map = new HashMap();
		for (int i=0; i<arr.length; i++)
		{
			int diff = target - arr[i];
			if (map.containsKey(diff))
			{
				x[0] = map.get(diff);
				x[1] = i;
			}
			else {
				map.put(arr[i], i);
			}
		}
		
		return x;
	}
	
	
	public static void main(String[] args) {
		
	int x [] = twoSum(new int [] {2,7,11,15}, 9);
	for (int y:x)
	{
		System.out.print(y + " ");
	}
		
	}

}
