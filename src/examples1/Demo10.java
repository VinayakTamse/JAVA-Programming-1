package examples1;

public class Demo10 {
	
	Demo10()
	{
		System.out.println("NO args");
	}
	
	Demo10(int num)
	{
		System.out.println("I am Constructor");
	}
	
	public static void main(String[] args) {
		
		int a = 20; int b=80;
		String ans = (a>b) ? "A is Greatest":"B is Greater";
		System.out.println(ans);
		
		String x = "Saturday";
		
		int day = (x.equals("Sunday"))? 1 : (x.equals("Monday")) ? 2 : (x.equals("Tuesday")) ? 3 : (x.equals("Wednesday")) ? 4: (x.equals("Thursday")) ? 5 : (x.equals("Friday")) ? 6 : (x.equals("Saturday")) ? 7 : 0;
		
		System.out.println(day);
		
		Demo10 d = new Demo10();
		
		DemoInterface inter = (m,n) -> m+n;
		
		JApp app = Demo10::m2;
		
		app.greet();
		
		JApp app1 = d::m1;
		
		app1.greet();
		
		JApp app2 = Demo10::new;
		
		app2.greet();
		
		DemoInterface.app();
		
		JApp.RR();
		
		
		
		
		
		
	}
	
	public void m1()
	{
		System.out.println("I am M1");
	}
	
	public static void m2()
	{
		System.out.println("I am Static M2");
	}
	


}
