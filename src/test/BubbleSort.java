package test;

public class BubbleSort {
	
	public static void main(String[] args) {
		int a [] = {9,1,3,2,7,5};
		int temp;
		boolean flag = false;
		
		for (int i=0; i<a.length; i++)
		{
		
			
			for (int j=0; i<a.length-1-i; j++)
			{
				if (a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
				
				
			}
		
		}
		
		for (int x : a)
		{
			System.out.print(x + " ");
		}
	}

}
