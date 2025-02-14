package static_concept;

public class MyClass {
	private int section;
	private static int srNo;
	
	static {
		System.out.println("Within Static");
	srNo=1000;
	
	
	}
	MyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
		srNo++;
		section++;
	}
	@Override
	public String toString() {
		return "MyClass [serial no="+srNo +" section=" + section + "]";
	}
	

	static void display() {
		
		System.out.println("Serial No"+srNo);
	}

}
