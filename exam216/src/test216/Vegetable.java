package test216;

public class Vegetable {
	
	String name;
	Vegetable(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		
		Vegetable spinach=new Vegetable("Spinach");
		System.out.println("Vegetable is " +spinach.name);
	
	}	
}
