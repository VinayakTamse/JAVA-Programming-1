import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example7 {
	
	public static int findMaxNumber(int arr [])
	{
		int max = arr[0];
		
		for (int i=1; i<arr.length; i++)
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int findmaxNumberM2(int arr [])
	{
		return Arrays.stream(arr).max().getAsInt();
	}
	
	public static int findmaxNumberM3(int arr [])
	{
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	}
	
	
	public static void main(String[] args) {
		int a1 [] = {3,6,7,8,10};
		System.out.println(findMaxNumber(a1));
		System.out.println(findmaxNumberM2(a1));
		System.out.println(findmaxNumberM3(a1));
	}
}
