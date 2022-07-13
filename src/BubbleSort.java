
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a [] = {6,9,1,3,2,5,80,6};
		
		int temp;
		
		for (int i=0; i<a.length; i++)
		{
			boolean flag = false;
			for (int j=0; j<a.length-1-i; j++)
			{
				if (a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
				
			}
			if (flag==false)
			{
				break;
			}
		}
		
		for (int x : a)
		{
			System.out.print(x + " ");
		}
		
	}

}
