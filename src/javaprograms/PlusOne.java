package javaprograms;

import java.util.Arrays;

public class PlusOne {
	
	public static int[] solution(int a[])
	{
		for (int i=a.length-1; i>=0; i--)
		{
			if (a[i] < 9)
			{
				a[i]++;
				return a;
			}
			
			a[i] = 0;
		}
		int num [] = new int[a.length+1];
		num[0] = 1;
		return num;
	}
	
	public static void main(String[] args) {
		
		int a [] = {4,3,2,1};
		int ans [] = solution(a);

		System.out.println(Arrays.toString(ans));
	}

}
