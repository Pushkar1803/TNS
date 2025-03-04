package interfacce;

public interface Bank {
	float minimal=5000;
	float deposit_limit=25000;
	
	public void deposit(float amount);
	public void withdraw() ;

}
