package examples2;

import java.util.Arrays;
import java.util.List;

public class OddAndEvenNumbers {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3, 4, 7,8,9,22,45,67,80,99,88,66);
		
		list.stream().filter(e -> !(e%2 == 0)).forEach(System.out::println);
	}

}
