package interfacce;
//entity class


public class Customer {
	private String name;
	private String cityString;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCityString() {
		return cityString;
	}
	public void setCityString(String cityString) {
		this.cityString = cityString;
	}
	public Customer() {
		System.out.println("Default");
	}
	public Customer(String name, String cityString) {
		super();
		this.name = name;
		this.cityString = cityString;
	}
	
	
	

}
