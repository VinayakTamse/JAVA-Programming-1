package examples1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo6 {
	
	public static void main(String[] args) {
		
		Stream.iterate(0, n -> n + 1).limit(100).filter(Demo6::is_prime).peek(System.out::println).count();
		System.out.println("=============================================");
		IntStream.range(0, 100).filter(Demo6::is_prime).peek(System.out::println).count();
		
	}
	
	public static boolean is_prime(int num)
	{
		if (num<=1)
		{
			return false;
		}
		
		return ! IntStream.rangeClosed(2, num/2).anyMatch(x -> num%x==0);
		
	}
	

}
