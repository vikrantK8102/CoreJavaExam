package Exam;

public class Account {

	int accNo;
	String name;
	double balance;
	
	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void UpdateBalance(double newBalance) {
		this.balance = newBalance;
	}

   public String getDetails() {
	   return "accno = "+accNo+",name = "+name+"balance=  "+balance;
   }
	
	
}
