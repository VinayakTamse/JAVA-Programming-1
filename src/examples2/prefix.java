package examples2;

import java.util.Arrays;
import java.util.List;

public class prefix {
	
	public static void main(String[] args) {
		
		List<Integer> numb = Arrays.asList(2, 333, 222, 444, 2222, 555, 222);
		
		numb.stream().map(e -> String.valueOf(e)).filter(e -> e.startsWith("2")).mapToInt(e -> Integer.valueOf(e)).forEach(System.out::println);
	}

}
