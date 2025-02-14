package inheritance;

public class Student extends Citizen {
	
	private int rollno;
	private String collegename;
	
	public Student() {
		
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	
	public Student(String nameString, String addressString, String addharno, long phonenumber,int rollno, String collegename) {
		super(nameString,addressString, addharno, phonenumber);
		this.rollno = rollno;
		this.collegename = collegename;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
