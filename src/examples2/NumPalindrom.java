package examples2;

public class NumPalindrom {
	
	
	public static void main(String[] args) {
		
		if (Palindrome(12321))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		strPalindrome("madam");
		strPalindrome("racecar");
		strPalindrome("bumperoffer");
		
	}
	
	public static boolean Palindrome(int num)
	{
		int rem;
		int sum = 0;
		int temp = num;
		
		while (temp != 0)
		{
			rem = temp % 10;
			System.out.println(rem);
			sum = (sum*10)+rem;
			temp = temp / 10;
			System.out.println(temp);
		}
		
		if (sum == num)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void strPalindrome(String str)
	{
		int len = str.length();
		int j = str.length()-1;
		int temp = 0;
		
		for (int i=0; i<len; i++)
		{
			if (str.charAt(i)==str.charAt(j--))
			{
				temp += 1;
			}
		}
		
		if (temp==len)
		{
			System.out.println(str + " is Palindrome");
		}
		else 
		{
			System.out.println(str + " not palindrome");
		}
		
	}
	

}
