package examples2;

public class BinarayToDecimal {
	
	public static void main(String[] args) {
		System.out.println(convertToDecimal(10011011));
		System.out.println(convertToDecimal(101101));
		System.out.println(convertToDecimal(100101));
		System.out.println(convertToDecimal(101));
		System.out.println(convertToDecimal(100101));
		System.out.println(convertToDecimal(111));
	}
	
	
	public static int convertToDecimal(long num)
	{
		int reminder = 0;
		int i = 0;
		int decimal = 0;
		while (num != 0)
		{
			reminder = (int) num % 10;
			num = num / 10;
			decimal = decimal + (reminder * power(2, i++));
			
		}
		
		return decimal;
	}
	
	public static int power(int base, int carry)
	{
		int res = 1;
		while (carry>0)
		{
			res *= base;
			carry--;
		}
		
		return res;
	}

}
