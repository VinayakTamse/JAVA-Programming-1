package examples1;

public class swapNumbers {
	
	public static void main(String[] args) {
		swap(10,80);
		swap(300, 899);
		
		swap("Selenium", "WebDriver");
		
	}
	
	public static void swap(int a, int b)
	{
		System.out.println("===Before Swapping===");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("===After Swapping===");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
	}
	
	public static void swap(String a, String b)
	{
		System.out.println("===Before Swapping===");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("===After Swapping===");
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		
	}

}
