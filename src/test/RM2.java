package test;

public class RM2 {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,2,3,3,4,5};
		
		
		int count = 0;
		
		for (int i=0; i<a.length; i++)
			
		{
			
			int temp = 0;
			
			if ( (i+1)<a.length && a[i]==a[i+1])
			{
				temp = 1;
			}
			
			if (temp==0)
			{
				count += 1;
			}
			
		}
		
		System.out.println(count);
		
	}

}
