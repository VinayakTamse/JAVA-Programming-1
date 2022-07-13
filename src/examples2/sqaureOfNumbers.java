package examples2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sqaureOfNumbers {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		list.stream().map(e -> e*e).forEach(System.out::println);
		
	}

}
