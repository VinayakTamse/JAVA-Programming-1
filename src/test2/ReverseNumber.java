package test2;

public class ReverseNumber {
	
	public static void reversenumber(int num)
	{
		int rev = 0;
		while (num != 0)
		{
			int rem = num % 10;
			rev = (rev*10)+rem;
			num = num / 10;
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		reversenumber(-1234);
	}

}
