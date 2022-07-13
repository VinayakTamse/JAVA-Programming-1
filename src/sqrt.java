
public class sqrt {
	
	public static int sqRt(int x)
	{
		if (x==0) return 0;
		int start = 1;
		int end = x;
		int res = 0;
		while (start <= end)//1 <= 25
		{
			int mid = start + (end-start)/2; // 1+ (25-1)/2 = 
			if (mid <= x/mid)
			{
				res = mid;
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sqRt(4));
	
	}

}
