package beans;

public class Employee {
	private int id;
	 private String name;
	static  String company = "apple";
	
	 public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name)
	{
		this.name = name;
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}

}
