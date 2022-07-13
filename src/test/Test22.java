package test;

public class Test22 {
	
	public static void main(String[] args) {
		
		int a [] = {2,8,9,10,22,78,89,1,3};
		int big = a[0];
		int small = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (big < a[i])
			{
				big = a[i];
			}
			
			if (small > a[i])
			{
				small = a[i];
			}
		}
		
		System.out.println(big);
		System.out.println(small);
	}

}
