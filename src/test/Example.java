package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {
	
	public static char test(String str)
	{
		char c= '\u0000';
		
		for (int i=0; i<str.length(); i++)
		{
			boolean unique = true;
			for (int j=0; j<str.length(); j++)
			{
				if (i!=j && str.charAt(i) == str.charAt(j))
				{
					unique = false;
					break;
				}
			}
			
			if (unique) {
				c = str.charAt(i);
				break;
			}
		}
		
		return c;
		
	}
	
	public static void main(String[] args) {
		System.out.println(test("vinayak"));
		System.out.println(test("test"));
	}

}
