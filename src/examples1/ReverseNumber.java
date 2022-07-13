package examples1;

public class ReverseNumber {
	
	
	public static void main(String[] args) {
		
		System.out.println(revNumber(123));
		
		
	}
	
	public static int revNumber(int num)
	{
		int rev = 0;
		while (num != 0)
		{
			int rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
		
		if (num>Integer.MAX_VALUE)
		{
			return 0;
		}
		return rev;
	}

}
