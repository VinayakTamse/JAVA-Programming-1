package test2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class appp {
	
	
	public static void main(String[] args) {
		
		int a [][] = {{1,2,3}, {9,5,7}, {4,10,0}};
		int max = a[0][0];
		
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				
				if (max < a[i][j])
				{
					max = a[i][j];
				}
			}
		}
		
		System.out.println(max);
		
	}

}
