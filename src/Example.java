import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example {
	
	
	public static boolean isoM(String s, String t)
	{
		Map<Character, Character> hm = new HashMap<Character, Character>();
		
		
			for (int i=0; i<s.length(); i++)
			{
				char  ss = s.charAt(i);
				char tt = t.charAt(i);
				
				if (hm.containsKey(ss))
				{
					if (hm.get(ss) != tt)
					{
						return false;
					}
				}
				else if (hm.containsValue(tt))
				{
					return false;
				}
				
				hm.put(ss, tt);
			}
			return true;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(isoM("egg", "add"));
		System.out.println(isoM("foo", "bar"));
		System.out.println(isoM("paper", "title"));
	}

}
