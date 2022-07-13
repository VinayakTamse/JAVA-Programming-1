package test;

import java.util.Arrays;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
		int x [] = {1,8,0,9,2,0,1,2,3,0,1,2,2,3,7};
	
		int count = 0;
		
		for (int i=0; i<x.length; i++)
		{
			if (x[i] != 0)
			{
				x[count++] = x[i];
			}
		}
		
		while (count < x.length)
		{
			x[count++] = 0;
		}
		
		for (int j=0; j<x.length; j++)
		{
			System.out.print(x[j] + " ");
		}
	}

}
