package Lab4Ex1;

public class Account extends Person {

	private long accNum;
	private double balance;
	public double w_a;


	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	

	public Account() {
		super();
		
	}

	

	public Account(long accNum, double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	}

	public void deposit(double d_a) {

		balance = balance + d_a;
		System.out.println("Deposit Successfull!!");
//		Account.getBalance(balance);

	}

	public void withdraw(double w_a) {

		balance = balance - w_a;
		System.out.println("Cash Withdrawn Successfully !!");
//		Account.getBalance(balance);

	}

//	public static void getBalance(double balance) {
//
//		System.out.println("current Balance " + balance + " Rs Only /-");
//
//	}

}
