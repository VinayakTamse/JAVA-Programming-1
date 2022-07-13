import java.util.HashSet;

public class Duplicates {
	
	public static void main(String[] args) {
		
		String a [] = {"java", "python", "java", "ruby", "c++", "javascript", "python", "c++"};
		HashSet<String> set = new HashSet<String>();
		boolean flag = false;
		
		for (int i=0; i<a.length; i++)
		{
			if (set.add(a[i])==false)
			{
				System.out.println("Duplicate element "+ a[i]);
				flag = true;
			}
		}
		if (flag == false)
		{
			System.out.println("No Duplicates");
		}
		
	}

}
