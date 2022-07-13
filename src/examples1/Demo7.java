package examples1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo7 {
	
	public static void main(String[] args) {
		
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(90);
		lists.add(45);
		lists.add(21);
		lists.add(97);
		lists.add(37);
		System.out.println(lists);
		Collections.sort(lists, (a, b)-> {
			
			if (a>b) {
				return 1;
			}
			return -1;
			
		});
		
		Collections.reverse(lists);
		System.out.println(lists);
		
		
		System.out.println("Sorting Using Functional Interface Comparator "+lists);
		System.out.println("");
		System.out.println("=========Sorting with Stream");
		lists.stream().sorted().forEach(System.out::println);
		System.out.println("Descending Order");
		lists.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
