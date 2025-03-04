package polymorphism;


	class RBI extends Bank{
		protected RBI getcolor() {
			RBI s=new RBI();
			return s;
			
		}
	}
	
	public class Bank {
		protected  Bank getcolor() {
			Bank s=new Bank();
			return s;
		}

}
