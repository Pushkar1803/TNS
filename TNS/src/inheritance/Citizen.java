package inheritance;

public class Citizen {
	private String nameString ;
	private String addressString;
	private String addharno;
	private long phonenumber;
	
	public Citizen() {
		System.out.println("Default");
	}
	
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public String getAddharno() {
		return addharno;
	}
	public void setAddharno(String addharno) {
		this.addharno = addharno;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Citizen(String nameString, String addressString, String addharno, long phonenumber) {
	
		this.nameString = nameString;
		this.addressString = addressString;
		this.addharno = addharno;
		this.phonenumber = phonenumber;
	}
	
	@Override
	public String toString() {
		return "Class [nameString=" + nameString + ", addressString=" + addressString + ", addharno=" + addharno
				+ ", phonenumber=" + phonenumber + "]";
	}
	

}
