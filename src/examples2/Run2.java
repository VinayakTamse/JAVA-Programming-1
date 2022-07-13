package examples2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Run2 {
	
	public static void main(String[] args) {
		
		//IntStream.iterate(1, n -> n + 1).limit(10).forEach(System.out::println);
		//IntStream.range(1, 10).limit(10).forEach(System.out::println);
		//Stream.iterate(2, n -> n + 2).limit(20).forEach(System.out::println);
		//Run2 r = new Run2();
		//r.addNumber(0);
		//System.out.println("Factorial of Number 5 is : "+r.findFactorial(0));
		List<Integer> lists = Arrays.asList(2,3,5,6,7,9,8);
		int max = lists.stream().map(e -> e).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
	}
	
	public void addNumber(int num)
	{
		
		if (num<=10)
		{
			System.out.println(num);
			addNumber(num + 1);
		}
		
	}
	
	public int findFactorial(int num)
	{
		int fact = 1;
		for (int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		return fact;
	}

}
