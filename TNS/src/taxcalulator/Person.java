package taxcalulator;

public class Person {
	
	private String nameString;
	private int income;
	private String genderString;
	private int age;
	private double tax;
	

	public double getTax() {
		return tax;
	}



	public void setTax(double tax) {
		this.tax = tax;
	}



	public String getNameString() {
		return nameString;
	}



	public void setNameString(String nameString) {
		this.nameString = nameString;
	}



	public int getIncome() {
		return income;
	}



	public void setIncome(int income) {
		this.income = income;
	}



	public String getGenderString() {
		return genderString;
	}

	
	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	


	@Override
	public String toString() {
		return "Person  name = " + nameString + ", income = " + income + ", gender = " + genderString + ", age = "
				+ age + ", tax = " + tax + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
