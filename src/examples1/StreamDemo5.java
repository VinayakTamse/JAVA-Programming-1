package examples1;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo5 {
	
	
	public static void main(String[] args) {
		
		System.out.println(getAlphabets());
		System.out.println("");
		getAlphabets().stream().forEach(System.out::println);
		System.out.println("");
		getAlphabets().parallelStream().forEach(System.out::println);
		System.out.println("");
		getAlphabets().stream().parallel().forEach(System.out::println);
		
		
		
	}
	
	public static List<String> getAlphabets()
	{
		
		List<String> alphas = new ArrayList<String>();
		
		int num = 97;
		
		while (num<=122)
		{
			char c = (char)num;
			alphas.add(String.valueOf(c));
			num += 1;
		}
		
		return alphas;
	}

}
