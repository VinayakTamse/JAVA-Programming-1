package examples1;

public class AmstrongNumbers {
	
	public static void isAmstrongNumber(int num)
	{
		int temp = num;
		int rem;
		int sum = 0;
		int pow = String.valueOf(temp).length();
		
		while (temp > 0)
		{
			rem = temp % 10;
			
			sum += Math.pow(rem, pow);
			
			temp = temp / 10;
		}
		
		if (sum == num)
		{
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not Amstrong Number");
		}
	}
	
	public static void main(String[] args) {
		for (int i=1; i<=1000; i++)
		{
			System.out.print(i+" is");
			isAmstrongNumber(i);
		}
		
	}
	

}
