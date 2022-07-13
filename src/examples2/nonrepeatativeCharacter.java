package examples2;

public class nonrepeatativeCharacter {
	
	public static void nonRepeat(String s)
	{
		String s1 = "";
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
				s1 = String.valueOf(s.charAt(i));
				break;
			}
		}
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		nonRepeat("test");
		nonRepeat("vinayak");
		nonRepeat("aabb");
	}

}
