package test;

public class SqRt {
	
	public static void main(String[] args) {
		
		int num = 81;
		int start = 1;
		int end = num;
		int result = 0;
		
		while (start<=end)
		{
			int mid = (start + end)/2;
			if (mid <= num/mid)
			{
				result = mid;
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		System.out.println(result);
		
	}

}
