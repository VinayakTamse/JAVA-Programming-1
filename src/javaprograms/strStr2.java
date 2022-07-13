package javaprograms;

public class strStr2 {
	
	public static int testStrStr(String hystack, String needle)
	{
		int h = hystack.length();
		int n = needle.length();
		if (n==0) return 0;
		if (n>h) return -1;
		for (int i=0; i<h-n+1; i++)
		{
			if (hystack.substring(i, i + n).equals(needle))
			{
				return i;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		int result = testStrStr("apple", "le");
		System.out.println(result);
		
		System.out.println(testStrStr("amazon", "app"));
		System.out.println(testStrStr("amazon", ""));
	}

}
