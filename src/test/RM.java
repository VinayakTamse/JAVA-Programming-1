package test;

public class RM {
	

	public static void main(String[] args) {
		
		int a [] = {1,1,2,3,4,5,6};
		int b [];
		int count = 0;
		for (int i=0; i<a.length; i++)
		{
			
			int temp = 0;
			
			for (int j=i+1; j<a.length; j++)
				
			{
				if (a[i]==a[j])
				{
					temp = 1;
					break;
				}
			}
			
			if (temp==0)
			{
				count++;
				
			}
			
			
			
			
		}
		
		System.out.println(count);

		
	}

}
