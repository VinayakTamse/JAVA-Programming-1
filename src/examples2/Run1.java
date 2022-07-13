package examples2;

public class Run1 {
	
	public static void remDup(String s1) {
	
		String s2 = "";
		for (int i=0; i<s1.length(); i++)
		{
			if (s2.indexOf(s1.charAt(i))== -1){
				
				s2 = s2 + s1.charAt(i);
			}

		}
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		
		remDup("RACECAR");
		remDup("APPLICATION");
		remDup("APP");
		remDup("SASSAPPPPAAASSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
	}
	
	

}
