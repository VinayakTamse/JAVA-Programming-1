package test;

public class app1 {
	
	public static boolean strStr(String hystack, String needle)
	{
		int h = hystack.length();
		int n = needle.length();
		boolean flag = false;
		
		for (int i=0; i<h-n+ 1; i++)
		{
			if (hystack.substring(i, i+n).equals(needle))
			{
				flag = true;
			}
		}
		
		return flag;
		
	}
	
	public static void main(String[] args) {
		System.out.println(strStr("apple", "pp"));
		System.out.println(strStr("apple", "am"));
	}

}
