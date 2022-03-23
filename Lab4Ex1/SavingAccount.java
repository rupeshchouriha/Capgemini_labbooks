package Lab4Ex1;

public class SavingAccount extends Account {

	final int minimumBalance = 500;

	public SavingAccount() {
		super();

	}

	public SavingAccount(long accNum, double balance) {
		super(accNum, balance);

	}

	@Override
	public void withdraw(double w_a) {

//		super.withdraw(w_a);
		if (super.getBalance() - w_a >= minimumBalance) {

			super.withdraw(w_a);
		} else {
			System.out.println("Minimum Balance should not be less than 500 ! ");
		}
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

}
