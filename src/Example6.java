import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example6 {

	public static void main(String[] args) {
		countDuplicates("vinayak");
	}
	
	public static void countDuplicates(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if (map.get(c)== null)
			{
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		Set<Entry<Character, Integer>> m = map.entrySet();
		for (Entry<Character, Integer> mm : m)
		{
			if (mm.getValue()>1)
			{
				System.out.println(mm.getKey() + " "+ mm.getValue());
			}
		}
	}
}
