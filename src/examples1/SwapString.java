package examples1;

public class SwapString {
	
	public static void swapString(String a, String b)
	{
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		
		System.out.println(a + "  " + b);
	}
	
	public static void sapInt(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}
	
	public static void main(String[] args) {
		swapString("Selenium", "WebDriver");
		swapString("Java", "Selenium");
		swapString("Python", "Selenium");
		sapInt(10, 80);
	}

}
