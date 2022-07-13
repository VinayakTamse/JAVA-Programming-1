package test;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int start = 1;
		int numRange = 10;
		
	
		
		while (start < numRange)
		{
			
			int temp= 0;
			for (int i=2; i<start; i++)
			{
				if (start%i==0)
				{
					temp = 1;
				}
			}
			
			if (temp==0)
			{
				System.out.println(start);
			}
			
			start++;
		}
	}

}
