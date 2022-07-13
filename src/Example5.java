import java.util.ArrayList;
import java.util.List;


public class Example5 {
	// Given string "50552" arrange [50, 05, 55, 52] and return max i.e 55
	
	public static void main(String[] args) {
		
		System.out.println(exeCute("50552"));
		System.out.println(exeCute("10101")); //10 01 10 01 0101
		System.out.println(exeCute("88"));
		System.out.println(exeCute("65241")); // 65 52 24 41 
	}
	
	public static int exeCute(String s)
	{
		char s1;
		char s2;
		List<Character> c1 = new ArrayList<Character>();
		List<Character> c2 = new ArrayList<Character>();
		List<String> se = new ArrayList<String>();
		for (int i=0; i<s.length()-1; i++)
		{
			s1 = s.charAt(i);
			c1.add(s1);
		}
		for (int j=1; j<s.length(); j++)
		{
			s2 = s.charAt(j);
			c2.add(s2);
		}
		
		System.out.println(c2);
		System.out.println(c1);
		
		for (int i=0; i<c1.size(); i++)
		{
			se.add(c1.get(i)+""+c2.get(i));
		}
		System.out.println(se);
		
		
		int result = se.stream().mapToInt(e -> Integer.valueOf(e)).max().getAsInt();
		
		return result;
		
		
	}

}
