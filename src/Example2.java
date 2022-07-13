import java.util.Arrays;
import java.util.HashMap;

public class Example2 {
	
	public static void main(String[] args) {
		String s = "Automation";
		
		StringBuffer sb = new StringBuffer(s);
		
		String rev = sb.reverse().toString();
		
		System.out.println(rev);
		
		StringBuilder sbl = new StringBuilder(s);
		sbl.reverse();
		System.out.println(sbl);
		sbl.append("Hello");
		System.out.println(sbl);
		
	
		
	}

}
