import java.util.ArrayList;

public class Appp0 {
	
	public static void main(String[] args) {
		ArrayList<Integer> lists = new ArrayList<Integer>();
		for (int i=1; i<=6; i++)
		{
			lists.add(i);
		}
		System.out.println(lists);
		lists.remove(3);
		System.out.println(lists);
		lists.removeAll(lists);
		System.out.println(lists);
		lists.clear();
		System.out.println(lists);
	}

}
