package oopsconcepts;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer d=new Customer();
		d.setCustomername("Pushkaraj");
		d.setCustomerId(8);
		d.setCustomercity("PUNE");
		
		System.out.println(d);
		
		Customer d1=new Customer("Pushkar", 18, "Pune");
		System.out.println(d1);

	}

}
