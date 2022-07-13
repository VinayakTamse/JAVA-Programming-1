package fauturesproject;

public class NewFeatureDemo1 {
	
	public static void main(String[] args) {
		
		var a = 20;
		var b = 38;
		System.out.println(a + b);
		
		var day = 7;
		
		var ans = switch(day)
		{
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid";
		};
		
		System.out.println(ans);
		
		var am = """
				"name":"Vinu",
				"place":"Karwar"
				
				""";
		
		System.out.println(am);
		
		//JDK14 Feature
		
		
	
		
	}

}
