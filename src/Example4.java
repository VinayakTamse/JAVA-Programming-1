import java.util.ArrayList;

public class Example4 {
	
	public static void runer(String s, String t)
	{
		ArrayList<Character> l1 = new ArrayList<Character>();
		for (int i=0; i<s.length(); i++)
		{
			char ss = s.charAt(i);
			char tt = t.charAt(i);
			if (!l1.contains(ss))
			{
				l1.add(ss);
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		runer("egg", "add");
	}

}
