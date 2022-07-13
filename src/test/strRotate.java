package test;

public class strRotate {
	
	public static void leftRotate(String s, int num)
	{
		String x = s.substring(num) + s.substring(0, num);
		System.out.println(x);
	}
	public static void rightRotate(String s, int num)
	{
		String y = s.substring(s.length()-num) + s.substring(0, s.length()-num);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		//application -> plicationap
		leftRotate("GeeksforGeeks", 2);
		//application -> onapplicati
		rightRotate("GeeksforGeeks", 2);
		
		leftRotate("KGF", 2);
		rightRotate("KGF", 2);
	}

}
