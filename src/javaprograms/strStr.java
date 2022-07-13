package javaprograms;

public class strStr {
	
	public static int strStr(String hystack, String needle)
	{
		int h = hystack.length();
		int n = needle.length();
		
		if (n==0)return 0;
		if (n>h)return -1;
		
		for (int i=0; i<h-n+1; i++)
		{
			if (hystack.substring(i, i+n).equals(needle))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
	}

}
