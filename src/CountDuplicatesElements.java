import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicatesElements {
	
	public static void Duplicates(int arr [])
	{
		HashMap<Integer, Integer> map = new HashMap();
		
		for (int i=0; i<arr.length; i++)
		{
			if (map.get(arr[i])==null)
			{
				map.put(arr[i], 1);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		Set<Entry<Integer,Integer>> nmap = map.entrySet();
		
		for (Entry<Integer,Integer> cc : nmap)
		{
			if (cc.getValue()>1)
			{
				System.out.println(cc.getKey() + " "+ cc.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		int a [] = {1,1,1,1,1,1,1,19,9,9};
		Duplicates(a);
	}

}
