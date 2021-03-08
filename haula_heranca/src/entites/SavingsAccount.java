package entites;

public class SavingsAccount extends Account {
	
	private Double interestDate;
	
	public SavingsAccount() {	
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestDate) {
		super(number, holder, balance);
		this.interestDate = interestDate;
	}

	public Double getInterestDate() {
		return interestDate;
	}

	public void setInterestDate(Double interestDate) {
		this.interestDate = interestDate;
	}
	
	public void updateBalance() {
		balance += balance * interestDate;
	}
	
	@Override 
	public final void withdraw(double amount) {
		balance -= amount;
	}

}
