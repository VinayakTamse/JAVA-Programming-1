package examples2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(10,2,3,2,2,4,4,5,5,5,5,5,6,6,6,7);
		
		list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		
	}

}
