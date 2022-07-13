package examples2;

import java.util.Arrays;
import java.util.List;

public class printSumOfNumbers {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10,20,30,40);
		int sum = list1.stream().reduce((a,b) -> a + b).get();
		System.out.println(sum);
	}

}
