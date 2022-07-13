package test;

import java.util.Arrays;

public class BinarySerach {
	
	public static void main(String[] args) {
		int x [] = {10,20,67,89,34,56,7,3,45,90};
		Arrays.sort(x);
		for (int c : x) {
			System.out.print(c + "  ");
		}
		int start = 0;
		int end = x.length-1;
		int key = 89;
		
		while (start<=end)
		{
			int mid = (start+end)/2;
			
			if (key == x[mid])
			{
				System.out.println("Found at index "+ mid);
				break;
			}
			
			else if (key<x[mid])
			{
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
			
		}
	}

}
