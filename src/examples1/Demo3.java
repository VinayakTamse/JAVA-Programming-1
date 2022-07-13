package examples1;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	
	public static void main(String[] args) {
		
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(23);
		lists.add(34);
		lists.add(45);
		int s = lists.stream().filter(o -> o==23).findAny().orElse(null);
		System.out.println(s);
		
	}

}
