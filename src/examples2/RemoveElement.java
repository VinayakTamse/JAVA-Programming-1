package examples2;

public class RemoveElement {
	
	public static int remove_element(int arr [], int element)
	{
		int j = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] != element)
			{
				arr[j] = arr[i];
				j++;
			}
		}
		
		return j;
	}
	
	public static void main(String[] args) {
		
		int a [] = {3,8,2,8,2,1,2,9,5};
		System.out.println(remove_element(a, 2));
		
	}

}
