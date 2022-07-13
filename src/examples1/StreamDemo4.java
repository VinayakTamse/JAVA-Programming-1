package examples1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo4 {
	
	public static void main(String[] args) {
		
		IntStream numrange = IntStream.range(1, 11);
		numrange.forEach(System.out::println);
		
		Stream<String> obj1 = Stream.of("a1", "a2", "a3", "a4", "a5");
		Stream<String> obj2 = Stream.of("a1", "a2", "a3", "a4", "a5");
		System.out.println("");
		
		
		obj1.map(x -> x.substring(1)).mapToInt(f -> Integer.parseInt(f)).max().ifPresent(c -> System.out.println("Max Value is "+c));
		obj2.map(x -> x.substring(1)).mapToInt(f -> Integer.parseInt(f)).min().ifPresent(c -> System.out.println("Min Value is "+c));
		System.out.println("");
		
		
		Stream.of(1.0, 2.0, 3.0, 4.0)
			  .mapToInt(Double::intValue)
			  .mapToObj(x -> "a"+x)
			  .forEach(System.out::println);
		System.out.println("");
		
		//Stream Iterate
		Stream.iterate(0, x -> x + 1).limit(20).forEach(System.out::println);
		
		//Print 10 odd Numbers
		System.out.println("");
		System.out.println("Odd Numbers");
		
		Stream.iterate(0, x -> x + 1).limit(100)
		.filter(p -> !(p%2==0)).limit(30).forEach(System.out::println);
		
	}

}
