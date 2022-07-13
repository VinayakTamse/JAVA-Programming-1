package examples2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {
	
	
	public static void main(String[] args) {
		
		List<Integer> lists = Arrays.asList(22,33,43,11,56,43,21,1,3,66,9);
		
		lists.stream().sorted().forEach(System.out::println);
		
		lists.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		int number = lists.stream().reduce((a,b)-> a + b).get();
		System.out.println("==============");
		System.out.println(number);
		
		int sum = lists.stream().mapToInt(e -> e).sum();
		
		System.out.println(sum);
		
		
		
	
		
		
	}

}
