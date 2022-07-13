package examples2;

public class Run3 {
	
	public static void main(String[] args) {
		
		String n = "Python";
		String s = "";
		for (int i=0; i<n.length(); i++)
		{
			s = s + (int)n.charAt(i);
		}
		
		System.out.println(s);
	}

}
