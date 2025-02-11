package oopsconcepts;

public class PersonDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Person p=new Person();
		p.setPcity("Pune");
		p.setpName("Pushkar");
		
		System.out.println("Default"+ p.getPcity()+p.getpName());
		
		Person p1=new Person("Pushkaraj", "Pune");
		System.out.println(p1);
		

		
	}

}
