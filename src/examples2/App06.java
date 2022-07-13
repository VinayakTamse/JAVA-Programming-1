package examples2;

import java.util.stream.IntStream;

public class App06 {
	
	public static void main(String[] args) {
		
	/*	System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(1));
		System.out.println(isPrimeNumber(9));
		System.out.println(isPrimeNumber(7));
		System.out.println(isPrimeNumber(5));
		System.out.println(isPrimeNumber(11));  */
		
		IntStream.rangeClosed(1, 100).map(e -> Integer.valueOf(e)).filter(App06::isPrimeNumber).forEach(System.out::println);
		
		
	}
	
	
	public static boolean isPrimeNumber(int num)
	{
		int temp = 0;
		if (num == 1)
		{
			return false;
		}
		for (int i=2; i<=num-i; i++)
			
		{
			if (num % i == 0)
			{
				temp = 1;
			}
		}
		
		if (temp == 0)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
