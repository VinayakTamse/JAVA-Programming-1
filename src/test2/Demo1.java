package test2;

public class Demo1 {
	
	static int mm = 10;
	int nn = 20;
	
	public static void main(String[] args) {
		byte c = 10; // 1 memory size
		short b = 10; // 2 memory
		int a = 10; // 4 memory
		long d = 100; // 8 memory
		//decimal
		float e = 10.20f; //4 memory
		double f = 10.398; //8 memory
		
		boolean g = false;
		char h = 'A';
		
		String i = "Vinu";
		String j = i.concat("bbbbb");
		String x = i + "appp";
		
		
		int arr [] = new int[4];
		
		Demo1.mm = 50;
		
		
		Demo1 aa = new Demo1();
		Demo1 ab = new Demo1();
		Demo1 ac = new Demo1();
		Demo1 ad = new Demo1();
		Demo1 ae = new Demo1();
		
		String y1 = "Abcd";
		String y2 = new String("Abcd");
		String y3 = "Abcd";
		String y4 = "Bcda";
		String y5 = new String("Bcda");
		
		//System.out.println(y1);
		//System.out.println(y2);
		//System.out.println(y1==y2);
		//System.out.println(y1.equals(y2));
		//System.out.println(y2.equals(y5));
		
		//String Methods
		
		String name = "Application";
		
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('i'));
		System.out.println(name.substring(0, 3));
		System.out.println(name.subSequence(0, 3));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.contains("cation"));
		System.out.println(name.equalsIgnoreCase("application"));
		String name2 = "     Vinayak    ";
		System.out.println(name2.trim());
		
		String name3 = "Good Morning Sampath";
		//System.out.println(name3.length());
		System.out.println(name3);
		String [] name4 = name3.split(" ");
		for (int k=0; k<name4.length; k++)
		{
			System.out.println(name4[k]);
		}
		
		String jk = "Sampath";
		
		for (int l=0; l<jk.length(); l++)
		{
			System.out.println(jk.charAt(l));
		}
		
		
		
		
	}

}
