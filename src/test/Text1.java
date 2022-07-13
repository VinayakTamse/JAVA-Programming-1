package test;

import java.util.Arrays;
import java.util.List;

public class Text1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,20,7,9,2,5,4);
		
		l.stream().map(e -> (e%2!=0)? e*2 : e).forEach(System.out::println);
	}

}
