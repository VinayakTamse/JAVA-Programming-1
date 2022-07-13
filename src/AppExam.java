import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppExam {
	
	
	
	
	public int[] squares(int[] array)
	{
		
		if (array == null)
		{
			return null;
		}
		
		int arr [] = new int[array.length];
		
		for (int i=0; i<array.length; i++)
		{
			arr[i] = array[i] * array[i];
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		AppExam app = new AppExam();
		
		//System.out.println(app.squares(null));
		System.out.println(Arrays.toString(app.squares(new int[]{-5,1,2,3}) ));

		
	}
	
	public void testapp(int x) {
		System.out.println(x);
	}
	
	public void testapp(int a, int b)
	{
		System.out.println(a + b);
	}


	
	

}
