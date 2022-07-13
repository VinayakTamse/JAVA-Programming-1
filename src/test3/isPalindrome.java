package test3;

public class isPalindrome {
	
	public static boolean Palindrome(int x)
	{
		int rev = 0;
		int num = x;
		
		while (num > 0)
		{
			int rem = num % 10;
			rev = (rev*10) + rem;
			num = num / 10;
		}
		
		if (rev==x)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(Palindrome(5432345));
		
	}

}
