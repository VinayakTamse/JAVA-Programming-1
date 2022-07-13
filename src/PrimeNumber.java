
public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num)
	{
		
		int temp = 0;
		if (num <=1)
		{
			return false;
		}
		
		for (int i=2; i<num; i++)
		{
			if (num%i==0)
			{
				temp = 1;
			}
		}
		
		if (temp==0)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(2));
		System.out.println(isPrimeNumber(9));
	}

}
