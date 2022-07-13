package test;

public class tesd {
	
	public static void main(String[] args) {
		
		int a [] = {0,1,9,3,4,7,8};
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=1; j<a.length; j++)
			{
				if (a[i] + a[j] == 7)
				{
					System.out.println(a[i] + " "+ a[j]);
				}
			}
			
		}
		
	}

}
