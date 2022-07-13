package test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class App012 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Apple");
		map.put(2, "Ball");
		map.put(3, "Cat");
		
		map.values().stream().forEach(System.out::println);
		
		Set<Entry<Integer,String>> set = map.entrySet();
		
		for (Entry<Integer, String> n : set)
		{
			System.out.println(n.getValue());
		}
		
		map.keySet().stream().forEach(System.out::println);
		
	}

}
