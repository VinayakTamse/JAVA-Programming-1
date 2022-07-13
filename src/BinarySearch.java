import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int a [] = {1,7,8,9,2,5};
		boolean flag = false;
		Arrays.sort(a);
		System.out.println("Sorted Array : ");
		for (int x : a)
		{
			System.out.print(x + " ");
		}
		
		int l = 0;
		int h = a.length-1;
		int key = 8;
		
		while (l<=h)
		{
			int m = (l + h)/2;
			if (a[m]==key)
			{
				System.out.println("Element found at "+ m);
				flag = true;
				break;
			}
			
			if (key > a[m])
			{
				l = m + 1;
			}
			if (key < a[m])
			{
			   h = m -1;
			}
			
			
		}
		
		if (flag==false)
		{
			System.out.println("Element Not Found");
		}
	}

}
