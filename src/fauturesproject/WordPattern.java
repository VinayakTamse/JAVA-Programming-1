package fauturesproject;

import java.util.HashMap;

public class WordPattern {
	
	public static boolean wordPattern(String pattern, String s)
	{
		String [] word = s.split("\\s");
		HashMap<Character, String> map = new HashMap();
		HashMap<String,Boolean> locked = new HashMap();
		for (int i=0; i<pattern.length(); i++)
		{
			char c = pattern.charAt(i);
			if (map.containsKey(c)==false)
			{
				if (locked.containsKey(word[i])== true)
				{
					return false;
				}
				else {
					locked.put(word[i], true);
					map.put(c, word[i]);
				}
			}
			
			else {
				String f = map.get(c);
				if (f.equals(word[i]) != true)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(wordPattern("abbb", "cat dog dog cat"));
		
	}

}
