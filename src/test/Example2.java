package test;

import java.util.Arrays;

public class Example2 {
	
	public static void main(String[] args) {
		int arr [] = {2,1,3,2,4,5,5};
		
		int ans = arr[0];
		for (int i=1; i<arr.length; i++)
		{
			ans = ans ^ arr[i];
			
			
		}
		
		System.out.println(ans);

	
	}

}
