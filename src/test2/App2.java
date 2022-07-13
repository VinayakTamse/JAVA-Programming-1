package test2;

public class App2 {
	
	public static void main(String[] args) {
		
		int num = 65;
		
		
		for (int i=0; i<=5; i++)
			
		{
			
			for (int j=5; j>=i; j--)
			{
				System.out.print(" "+" ");
			}
			
			for (int j=5; j>=1; j--)
			{
				System.out.print((char)(num + j)+ " ");
			}
			
			System.out.println("");
		}
		
	}

}
