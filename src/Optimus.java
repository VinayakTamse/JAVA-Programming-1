import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Optimus {
	
	public static void main(String[] args) {
		int a [] = {7,7,8,9};
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i=0; i<a.length; i++)
		{
			if (hm.get(a[i])==null)
			{
				hm.put(a[i], 1);
			}
			else {
				hm.put(a[i], hm.get(a[i]) + 1);
			}
		}
		
		hm.forEach((k,v) -> {
			if (v>1)
			{
				System.out.println(k);
			}
		});
		
		
		
	}

}
