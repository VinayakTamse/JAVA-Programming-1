package examples1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberStreamApi {
	
	public static void main(String[] args) {
		
	Stream.iterate(1, n -> n + 1).limit(100)
		.filter(s -> isPrime(s)).forEach(System.out::println);
		
		
	
		
	}
	
	public static boolean isPrime(int num)
	{
		
		if (num==1)
		{
			return false;
		}
		
		return ! IntStream.rangeClosed(2, num/2).anyMatch(x -> (num%x == 0));
		
	}
	
	
	

}
