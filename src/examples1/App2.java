package examples1;

import java.util.ArrayList;

public class App2 {
	
	public static void main(String[] args) {
		
		String s = "50552";
		ArrayList<String> lists;
		String s1 = s.substring(0, 2);
		String s2 = s.substring(1, 3);
		String s3 = s.substring(2, 4);
		String s4 = s.substring(3, s.length());
		lists = new ArrayList<String>();
		lists.add(s1);
		lists.add(s2);
		lists.add(s3);
		lists.add(s4);
		System.out.println(lists);
		int num = lists.stream().map(e -> Integer.valueOf(e)).mapToInt(e -> e).max().getAsInt();
		System.out.println(num);
		
		
		
	}

}
