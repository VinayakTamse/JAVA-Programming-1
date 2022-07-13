package examples1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo4 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			
			System.out.println("");
		}
		System.out.println("======================");
		System.out.println("");
		IntStream.range(1, 6).map(c -> c+1).forEach(System.out::println);
		Stream.iterate(1, x -> x + 1).limit(6).forEach(n -> {
			
			Stream.iterate(1, y -> y+1).limit(6).forEach(g -> {
				System.out.println(g);
			});
			
		});
		
	}

}
