package examples2;

import java.util.Arrays;
import java.util.List;

public class averageOfNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		
		Double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println(avg);
		
		int sum = list.stream().mapToInt(e -> e).sum();
		
		System.out.println(sum);
		
	}

}
