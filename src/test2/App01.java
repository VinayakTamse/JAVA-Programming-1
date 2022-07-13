package test2;

public class App01 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		App01 ap = new App01();
		App01 ap2 = new App01(10);
		String x = "Vinayak";
		App01 ap3 = new App01(x);
		ap.m1();
		m2();
		ap.add(20, 30);
		int a = 10;
		double d = 12.78;
		float s = 4.78f;
		
	}
	
	public App01()
	{
		System.out.println("Constructor");
	}
	
	public App01(int x)
	{
		System.out.println("Value is X : "+ x);
	}
	
	public App01(String x)
	{
		System.out.println("Value of X is : "+x);
	}
	
	public void m1()
	{
		System.out.println("method 1");
	}
	
	public void add(int a, int b)
	{
		System.out.println("Answer is : "+  (a+b));
	}
	
	public static void m2()
	{
		System.out.println("method 2");
	}

}
