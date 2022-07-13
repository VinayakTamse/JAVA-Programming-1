package beans;

public class Source {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "abcd");
		Employee emp2 = new Employee(2, "abbaa");
		Employee emp3 = new Employee(3, "bacd");
		Employee emp4 = new Employee(4, "xyzlm");
		Employee emp5 = new Employee();
		emp1.setId(109);
		emp1.setName("Arjun");
		
		Employee.company = "Google";
		System.out.println(emp1.getId() + " " + emp1.getName()+" "+Employee.company);
		System.out.println(emp2.getId() + " " + emp2.getName()+" "+Employee.company);
		System.out.println(emp3.getId() + " " + emp3.getName()+" "+Employee.company);
		System.out.println(emp4.getId() + " " + emp4.getName()+" "+Employee.company);
		Employee.company = "nan";
		System.out.println(emp5.getId() + " " + emp5.getName()+" "+Employee.company);
	}

}
