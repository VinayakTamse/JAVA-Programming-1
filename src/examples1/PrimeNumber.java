package examples1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++)
		{
			boolean value = isPrime(i);
			if (value)
			{
				System.out.println(i);
			}
		}
		
	}
	
	
	public static boolean isPrime(int number)
	{
		
		boolean isPrime = true;
		if (number<=1)
		{
			return false;
		}
	
		
		for (int j=2; j<number; j++)
		{
			if (number%j==0)
			{
				isPrime=false;
			}
		}
		return isPrime;
	}
	


}
