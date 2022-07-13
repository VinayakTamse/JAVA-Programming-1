package examples2;

public class app {
	
	public static void numbers(int num)
	{
		if (num<=100)
		{
			System.out.println(num);
			numbers(num + 1);
		}
	}
	
	public static void main(String[] args) {
		
		numbers(1);
		
	}

}
