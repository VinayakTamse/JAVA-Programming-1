
public class AB {
	
	class B{
		
		
		int x;
		
		B(int x)
		{
			this.x = x;
		}
		
		
		public void test()
		{
			System.out.println("test method");
		}
		
	}
	
	static class M {
		
		public static void test()
		{
			System.out.println("From Static class");
		}
		public static void main(String[] args) {
			System.out.println("Main method in static class");
		}
	}
	public static void main(String[] args) {
		AB ab = new AB();
		B b = ab.new B(9);
		b.test();
		System.out.println(b.x);
		M.test();
		M.main(null);
	}

}
