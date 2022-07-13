package examples1;

public class appde {
	
	public static void main(String[] args) {
		
		
		String ans = palindrome("madam");
		System.out.println(ans);
		
		System.out.println("baburao is "+palindrome("baburao"));
		System.out.println("racecar is "+palindrome("racecar"));
		
	}
	
	public static String palindrome(String m)
	{
		int j = m.length()-1;
		int temp = 0;
		for (int i=0; i<m.length(); i++)
		{
			if (m.charAt(i) == m.charAt(j--))
			{
				temp += 1;
			}
		}
		
		if (temp == m.length())
		{
			return "Palindrome";
		}
		else
		{
			return "Not Palindrome";
		}
	}

}
