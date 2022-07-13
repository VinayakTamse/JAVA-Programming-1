import java.util.HashMap;

public class IsoMorphicStrings {
	
	public static boolean is_Isomprphic(String s, String t)
	{
		HashMap<Character,Character> map = new HashMap();
		if (s.length() != t.length())
		{
			return false;
		}
		
		for (int i=0; i<s.length(); i++)
		{
			char ss = s.charAt(i);
			char tt = t.charAt(i);
			
			if (map.containsKey(ss))
			{
				if (map.get(ss) != tt)
				{
					return false;
				}
			}
			else if (map.containsValue(tt))
			{
				return false;
			}
			map.put(ss, tt);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(is_Isomprphic("add", "egg"));
		System.out.println(is_Isomprphic("foo", "bar"));
		System.out.println(is_Isomprphic("paper", "title"));
	}

}
