package oopsconcepts;

public class Customer {
	
	private String customername;
	private int customerId;
	private String customercity;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Default Customer");
	}
		
		
	public Customer(String customername, int customerId, String customercity) {
		super();
		this.customername = customername;
		this.customerId = customerId;
		this.customercity = customercity;
		System.out.println("parameterised constructor");
	}

	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomercity() {
		return customercity;
	}


	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}


	@Override
	public String toString() {
		return "Customer [customername = " + customername + ", customerId = " + customerId + ", customercity = "
				+ customercity + "]";
	}



}
