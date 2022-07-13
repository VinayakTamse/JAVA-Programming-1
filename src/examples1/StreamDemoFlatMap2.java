package examples1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import beans.Customers;

public class StreamDemoFlatMap2 {
	
	public static void main(String[] args) {
		
		
		Customers customer1 = new Customers();
		customer1.setName("Ram");
		customer1.addProducts("Lenova");
		customer1.addProducts("Samsung");
		customer1.addProducts("Toshiba");
		
		
		

		Customers customer2 = new Customers();
		customer2.setName("Rahul");
		customer2.addProducts("Lenova");
		customer2.addProducts("Samsung");
		customer2.addProducts("Dell");
		
		
		
		List<Customers> customerLists = new ArrayList<Customers>();
		customerLists.add(customer1);
		customerLists.add(customer2);
		
		List<String> prodsLists = customerLists.stream().map(x -> x.getProducts()).flatMap(f -> f.stream()).distinct().collect(Collectors.toList());
		
		prodsLists.forEach(c -> {
			System.out.println(c);
		});
		
		
	}

}
