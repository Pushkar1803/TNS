package interfacce;

public class Saving_Account extends Customer implements Bank{
private int accno;
private int balance;


	public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

}
