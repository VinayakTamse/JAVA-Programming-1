package beans;

public class BinarySerach {
	
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,7,9};
		int l = 0;
		int h = a.length-1;
		int key = 7;
		
		while (l<=h)
		{
			int mid = (l + h)/2;
			if (key == a[mid])
			{
				System.out.println("key found at : "+mid);
				break;
			}
			
			if (key > a[mid])
			{
				l = mid + 1;
				
			}
			if (key < a[mid])
			{
				h = mid - 1;
			}
		}
	}

}
