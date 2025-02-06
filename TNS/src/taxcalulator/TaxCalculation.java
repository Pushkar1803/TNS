package taxcalulator;

public class TaxCalculation {
	
	public void calculateTax(Person person) {
	
		
		
		if(person.getAge()>65 || person.getGenderString().equalsIgnoreCase("Female")) {
			
			person.setTax(0);
			System.out.println("You are not elligible to pay tax !! ENJOY");
			
		}else {
			
			if(person.getIncome() <=200000) {
				person.setTax(0);
				}
			if(person.getIncome() > 200000 && person.getIncome()<=500000) {
				person.setTax(person.getIncome()-50000 * 0.1 );
			}
			if(person.getIncome() > 500000 && person.getIncome()<=800000) {
				person.setTax(person.getIncome()-800000 * 0.2 + 300000 );
				
			}
			if(person.getIncome() > 800000 && person.getIncome()<=1200000) {
				person.setTax(person.getIncome()-1200000 * 0.3 + 900000 );
				
			}
			
			
		}
		
		
		
	}
	
	
	
	


}
