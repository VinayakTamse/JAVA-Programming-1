package javaprograms;

import java.util.HashMap;

public class WordPattern {
	
	public static boolean wordPattern(String pattern, String s)
	{
		String [] word = s.split(" ");
		HashMap<Character,String> map = new HashMap<Character, String>();
		HashMap<String,Boolean> used = new HashMap<String, Boolean>();
		for (int i=0; i<pattern.length(); i++)
		{
			char c = pattern.charAt(i);
			if (map.containsKey(c)==false)
			{
				if (used.containsKey(word[i]) == true)
				{
					return false;
				}
				else {
					used.put(word[i], true);
					map.put(c, word[i]);
				}
			}
			else {
				String f = map.get(c);
				if (f.equals(word[i])==false)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
		System.out.println(wordPattern("abbaaac", "the box box the box box box"));
	}

}
