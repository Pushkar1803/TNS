package oopsconcepts;

public class Person {
	private String pName;
	private String pcity;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	
	public Person(String pName, String pcity) {
		super();
		this.pName = pName;
		this.pcity = pcity;
	}
	
	@Override
	public String toString() {
		return "Person [pName=" + pName + ", pcity=" + pcity + "]";
	}
	
	public Person() {}
	

}
