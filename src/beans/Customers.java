package beans;

import java.util.HashSet;
import java.util.Set;

public class Customers {
	
	private String name;
	private Set<String> products;
	
	public Customers(String name, Set<String> products)
	{
		this.name = name;
		this.products = products;
	}

	public Customers()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getProducts() {
		return products;
	}

	public void setProducts(Set<String> products) {
		this.products = products;
	}
	
	public void addProducts(String product)
	{
		if (products == null)
		{
			products = new HashSet<String>();
		}
		products.add(product);
	}
	
	

}
