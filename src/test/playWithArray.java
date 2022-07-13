package test;

import java.util.Arrays;
import java.util.List;

public class playWithArray {
	
	public static void main(String[] args) {
		
		List<Integer> lists = Arrays.asList(10,20,6,1,8,3,9);
		int temp;
		
		for (int i=0; i<lists.size(); i++)
		{
			for (int j=0; j<lists.size()-1; j++)
			{
				if (lists.get(j) > lists.get(j+1))
				{
					 temp = lists.get(j);
					 lists.set(i, lists.get(j+1));
					 lists.set(j, temp);
					
				}
			}
		}
		System.out.println(lists);
	}

}
