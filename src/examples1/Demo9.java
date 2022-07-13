package examples1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo9 {
	
	public static void main(String[] args) {
		
		Stream.iterate(0, n -> n+1).limit(100).filter(Demo9::isPrimeNumber).forEach(System.out::println);
		
	}
	
	public static boolean isPrimeNumber(int num)
	{
		if (num<=1)
		{
			return false;
		}
		
		 return ! IntStream.rangeClosed(2, num).anyMatch(e -> num%2 == 0);
	}

}
