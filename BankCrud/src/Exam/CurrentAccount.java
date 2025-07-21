package Exam;

public class CurrentAccount extends Account {

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
		this.accNo = accNo;
		this.name= name;
		this.balance= balance;
		
	}

	@Override
	public String getDetails() {
		
		return "current: "+ super.getDetails();
	}

	
	
}
