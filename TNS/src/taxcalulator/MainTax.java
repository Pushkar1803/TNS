package taxcalulator;

import java.util.*;

public class MainTax {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=scanner.next();
		System.out.println("Enter Age");
		int age=scanner.nextInt();
		System.out.println("Enter Gender");
		String gender=scanner.next();
		System.out.println("Enter Income");
		int income=scanner.nextInt();
		
		Person person=new Person();
		person.setNameString(name);
		person.setAge(age);
		person.setGenderString(gender);
		person.setIncome(income);
		
		System.out.println(person);
		
		TaxCalculation taxCalculation=new TaxCalculation();
		taxCalculation.calculateTax(person);
		System.out.println(person);
		
		
		
		
	}

}
