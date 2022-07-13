package examples1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo8 {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> lists = Arrays.asList(99,8,2,9,4,8,67,80,70,48);
		int min = lists.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		int max = lists.stream().max((a,b)-> a.compareTo(b)).get();
		System.out.println(max);
		
		int value = lists.stream().reduce((x,y)->x+y).get();
		System.out.println(value);
		
		int summ = lists.stream().mapToInt(e -> e).sum();
		System.out.println(summ);
		
		double avg = lists.stream().mapToDouble(e -> e).average().getAsDouble();
		System.out.println(avg);
		
		double avgg = lists.stream().mapToInt(e-> e).average().getAsDouble();
		int avg2 = (int)avgg;
		
		System.out.println(avg2);
		
	}

}
