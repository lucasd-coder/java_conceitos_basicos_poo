package entites;

import java.util.Date;

public class Installment {
	
	private Date dueDaata;
	private Double amount;
	
	public Installment() {		
	}

	public Installment(Date dueDaata, Double amount) {
		super();
		this.dueDaata = dueDaata;
		this.amount = amount;
	}

	public Date getDueDaata() {
		return dueDaata;
	}

	public void setDueDaata(Date dueDaata) {
		this.dueDaata = dueDaata;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
