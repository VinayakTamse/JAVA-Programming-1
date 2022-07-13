import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P1 {
	
	public static boolean isPrime(int num)
	{
		if (num<=1)
		{
			return false;
		}
		return ! IntStream.rangeClosed(2, num/2).anyMatch(e -> num%e==0);
	}
	
	public static void main(String[] args) {
		Stream.iterate(1, i -> i+1).limit(100).filter(P1::isPrime).peek(System.out::println).count();
	}

}
