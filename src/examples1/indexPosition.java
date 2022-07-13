package examples1;

public class indexPosition {
	
	public static void main(String[] args) {
		
		String s = "vinayak";
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.subSequence(0, 5));
		System.out.println(s.substring(0, 5));
		int index = s.indexOf('a')+1;
		System.out.println(s.indexOf('a', index));
		
	}

}
