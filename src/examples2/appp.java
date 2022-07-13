package examples2;

public class appp {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,2,1,1};
		int l = a.length/2;
		for (int i=0; i<a.length; i++)
		{
			for (int j=l; j>=0; j--)
			{
				if (a[i] == a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
