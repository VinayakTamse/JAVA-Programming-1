package examples1;

public class run3 {
	
	public static void main(String[] args) {
		String s = "VINU787&9865EFG#Z";
		char [] c = s.toCharArray();
		int count = 0;
		
		for (int i=0; i<c.length; i++)
		{
			System.out.println((int)c[i]);
			if (((int)c[i]>=65) && ((int)c[i]<=90) )
			{
				count += 1;
			}
		}
		System.out.println(count);
	}

}
