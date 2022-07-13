package test;

public class solun {
	
	public static void main(String[] args) {
		Apps app = new Apps(101, "abbba", "bv");
		System.out.println(app.getState());
		app.setState("object");
		System.out.println(app.getState());
		app.state = "ojab";
		System.out.println(app.getState());
	}

}
