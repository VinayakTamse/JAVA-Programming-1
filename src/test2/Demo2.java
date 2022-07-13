package test2;


import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<Integer> set = new TreeSet(Collections.reverseOrder());
		set.add(23);
		set.add(78);
		set.add(90);
		set.add(20);
		set.add(99);
		set.add(28);
		
		List<Integer> ilist = set.stream().filter(e -> e%2==0).collect(Collectors.toList());
		
		System.out.println(ilist);
		
		
	}

}
