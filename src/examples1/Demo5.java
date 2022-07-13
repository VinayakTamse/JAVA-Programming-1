package examples1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	
	public static void main(String[] args) {
		
		List<Integer> lists = Arrays.asList(19,20,34,78,98,33,67);
		
		List<Integer> ans = lists.stream().filter(x -> x>50).collect(Collectors.toList());
		
		System.out.println(ans);
		
		int x = lists.stream().min(Comparator.reverseOrder()).get();
		System.out.println(x);
		
	}

}
