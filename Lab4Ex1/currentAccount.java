package Lab4Ex1;

public class currentAccount extends Account {
	
	private double overDraft = 50000;

	public currentAccount() {
		super();
		
	}

	public currentAccount(long accNum, double balance) {
		super(accNum, balance);
		
	}

	@Override
	public void withdraw(double w_a) {
		// TODO Auto-generated method stub
		//super.withdraw(w_a);
		
		if((super.getBalance()+w_a)>overDraft) {
			
			System.out.println("Over draft Limit Is Exceede Now !");
		}
		else {
			System.out.println("Over Draft Limit Not Exceeded Yet !");
		}
	}
	
	public double isOverdraftLimit() {
		return overDraft;
	}
	
	
	
	
	
	
}
