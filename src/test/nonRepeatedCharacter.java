package test;

public class nonRepeatedCharacter {
	
	public static String nonRepeated(String s)
	{
		String str = "";
		for (int i=0; i<s.length(); i++)
		{
			boolean unique = true;
			for (int j=0; j<s.length(); j++)
			{
				if (i!=j && s.charAt(i)==s.charAt(j))
				{
					unique = false;
					break;
				}
			}
			if (unique)
			{
				str = String.valueOf(s.charAt(i));
				break;
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(nonRepeated("test"));
	}

}
