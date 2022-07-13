import java.util.HashMap;

public class WordPattern {
	
	public static boolean wordPattern(String pattern, String s)
	{
		String word [] = s.split(" ");
		HashMap<Character, String> hm = new HashMap();
		HashMap<String, Boolean> used = new HashMap();
		
		for (int i=0; i<pattern.length(); i++)
		{
			char c = pattern.charAt(i);
			if (hm.containsKey(c) == false)
			{
				if (used.containsKey(word[i])==true)
				{
					return false;
				}
				else {
					used.put(word[i], true);
					hm.put(c, word[i]);
				}
			}
			else {
				String f = hm.get(c);
				if (f.equals(word[i]) == false)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(wordPattern("aaaa", "dog cat cat dog"));
		
	}

}
