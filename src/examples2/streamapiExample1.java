package examples2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamapiExample1 {
	
	public static void main(String[] args) {
		
		List<Integer> lis = Stream.iterate(0, n -> n+1).limit(10).collect(Collectors.toList());
		
		System.out.println(lis);
		
		int max = IntStream.rangeClosed(0, 10).limit(10).max().getAsInt();
		System.out.println(max);
	}

}
