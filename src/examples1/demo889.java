package examples1;

import java.util.HashMap;
import java.util.Map;

public class demo889 {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "Rahul");
		map.put(24, "Jason");
		map.put(77, "Jagan");
		
		for (String names : map.values())
		{
			System.out.println(names);
		}
		
		for (Integer key : map.keySet())
		{
			System.out.println(key);
		}
	}

}
