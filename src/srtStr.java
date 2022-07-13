
public class srtStr {
	
	public static void strStr(String hystack, String needle)
	{
		
		char c = needle.charAt(0);
		int res = 0;
		
		for (int i=0; i<hystack.length(); i++)
		{
			if (c == hystack.charAt(i))
			{
				res = i;
				break;
			}
			
			else {
				res = -1;
			}
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		strStr("hello", "ll");
	}

}
