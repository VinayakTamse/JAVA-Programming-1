package javaprograms;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int a [] = {2,8,9,7,5,1};
		Arrays.sort(a);
		for (int x : a) {System.out.print(x+ " ");};
		System.out.println("");
		int low = 0;
		int high = a.length-1;
		int key = 2;
		boolean found = false;
		
		while (low<=high)
		{
			int mid = (low + high) /2;
			if (key == a[mid])
			{
				System.out.println(a[mid]+" found at index : "+mid);
				found = true;
				break;
			}
			
			 if (key > a[mid])
			{
				low = mid + 1;
				
			}
			
			 if (key < a[mid])
			{
				high = mid - 1;
			}
		}
		
		if (found == false)
		{
			System.out.println("element not found");
		}
		
	}

}
