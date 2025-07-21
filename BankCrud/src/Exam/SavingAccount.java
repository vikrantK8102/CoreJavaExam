package Exam;

public class SavingAccount extends Account {

	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
		this.accNo = accNo;
		this.name= name;
		this.balance= balance;
		
	}

	@Override
	public String getDetails() {
		
		return "saving: "+super.getDetails();
	}

	
  
	

}
