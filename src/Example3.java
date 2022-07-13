import java.util.Hashtable;

public class Example3 {
	
	public static void main(String[] args) {
		
		System.out.println(isomorphicStrings("egg", "add"));
		
		System.out.println(isomorphicStrings("foo", "bar"));
		
		System.out.println(isomorphicStrings("title", "paper"));
		
	}
	
	public static boolean isomorphicStrings(String s, String t)
	{
		Hashtable<Character, Character> table = new Hashtable<Character, Character>();
		
		if (s.length() != t.length())
		{
			return false;
		}
		
		for (int i=0; i<s.length(); i++)
		{
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			
			if (table.containsKey(s1))
			{
				if (table.get(s1) != t1)
				{
					return false;
				}
			}
			else if (table.containsValue(t1))
			{
				return false;
			}
			
			table.put(s1, t1);
			
		}
		return true;
	}
}
