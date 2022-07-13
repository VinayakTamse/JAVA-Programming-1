package examples2;

public class Pattren1 {

	
	public static void main(String[] args) {
		
		int alpha = 65+32;
		
		for (int i=0; i<=5; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print( (char)(alpha + j) + " ");
			}
			System.out.println("");
		}
		
	}
	
}
