import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		String s1 = "tupple";
		String s2 = "Appleo";
		
		String t = s1.toLowerCase();
		String t1 = s2.toLowerCase();
		
		char [] tt = t.toCharArray();
		char [] tt1 = t1.toCharArray();
		
		Arrays.sort(tt);
		Arrays.sort(tt1);
		
		if (Arrays.equals(tt, tt1))
		{
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}

}
