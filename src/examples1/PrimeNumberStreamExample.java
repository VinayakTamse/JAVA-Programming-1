package examples1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberStreamExample {
	
	public static void main(String[] args) {
		
		long count = Stream.iterate(1, n -> n+1).limit(100).filter(PrimeNumberStreamExample::isPrime)
												.peek(x -> System.out.println(x))
													.count();
		
		System.out.println("Total Prime Numbers :"+count);
		
	}
	
	public static boolean isPrime(int num)
	{
		
		if (num==1) {
			return false;
		}
		return ! IntStream.rangeClosed(2, num/2).anyMatch(x -> num%x == 0);
					
	}

}
