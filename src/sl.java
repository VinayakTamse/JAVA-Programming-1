import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

public class sl {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,8,9,3,7,89,67,98,34,25);
		
		int maxVlaue = l.stream().mapToInt(e -> Integer.valueOf(e)).max().getAsInt();
		
		//System.out.println(l.stream().max(Comparator.comparing(Integer::valueOf)).get());
		
		//System.out.println(maxVlaue);
		
		l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==============================");
		l.stream().sorted(Comparator.comparingInt(e -> e)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==============================");
		l.stream().sorted((a,b) -> (a>b)? 1 : (a<b)? -1 : 0).collect(Collectors.toList()).forEach(System.out::println);
		
	
		
		
		
	}

}
