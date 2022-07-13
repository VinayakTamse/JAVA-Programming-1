import java.util.Arrays;

public class Binarysearch1 {
	
	public static class arrange
	{
		public static void arrangeArray(int a [])
		{
			Arrays.sort(a);
		}
	}
	
	public static boolean binarysearch(int a [], int key)
	{
		arrange.arrangeArray(a);
		int start = 0;
		int end = a.length-1;
		boolean flag = false;
		while (start<=end)
		{
			int median = (start + end)/2;
			if (key == a[median])
			{
				flag = true;
				
				break;
				
			}
			
			if (key < a[median])
			{
				end = median -1;
			}
			if (key > a[median])
			{
				start = median + 1;
			}
			
			
		}
		
		return flag;
		
	}
	
	public static void main(String[] args) {
		boolean soln1 = Binarysearch1.binarysearch(new int[] {2,1,3,5,4}, 5);
		boolean soln2 = Binarysearch1.binarysearch(new int[] {2,1,3,5,4}, 3);
		System.out.println(soln1);
		System.out.println(soln2);
	}

}
