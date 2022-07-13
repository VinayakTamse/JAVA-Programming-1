package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	
	public static void test(String str)
	{
		
		List<Integer> l1 = Arrays.asList(20,90,10,20,60);
		List<Integer> l2 = Arrays.asList(20,90,10,20,60);
		List<Integer> l3 = Arrays.asList(20,90,10,20,60);
		List<List<Integer>> m = Arrays.asList(l1,l2,l3);
		System.out.println(m);
		
	}
	
	public static void main(String[] args) {
		test("run");
	}
	
	

}
