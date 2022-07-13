package test2;

public class NonReapeat {
	
	public static void main(String[] args) {
		
		String s = "test";
		String result = null;
		
		for (int i=0; i<s.length(); i++)
		{
			boolean Unique = true;
			
			for (int j=0; j<s.length(); j++)
			{
				if (i!=j && s.charAt(i) == s.charAt(j))
				{
					Unique = false;
					break;
				}
			}
			
			if (Unique)
			{
				result = String.valueOf(s.charAt(i));
				break;
			}
		}
		
		System.out.println(result);
		
	}

}
