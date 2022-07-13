
public class MissingNumber {
	
	public static void main(String[] args) {
		
		int a [] = {2,3,4,5,1};
		int N = a.length+1;
		int sum = 0;
		
		for (int i=0; i<a.length; i++)
		{
			sum += a[i];
		}
		
		int total = (N*(N+1))/2;
		System.out.println(total-sum);
	}

}
