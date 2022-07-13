package examples1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {
		
		String [] items = {"Mango", "Apple", "Grapes", "Banana", "Orange", "Lemon"};
		List<String> list = Arrays.asList(items);
		List<String> result = list.stream().filter(ele -> ! ele.equals("Lemon")).collect(Collectors.toList());
		result.forEach(r -> System.out.println(r));
		System.out.println("==================================");
		result.stream().forEach(System.out::println);
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i=1; i<=100; i++)
		{
			list1.add(i);
		}
		
		List<Integer> res2 = list1.stream().filter(m -> m>50).collect(Collectors.toList());
		res2.forEach(System.out::println);
	}

}
