package Exam;

import java.util.Objects;

public class BankAccount {

	int accNo;
	String name;
	double balance;
	
	public BankAccount(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(!(o instanceof BankAccount)) return false;
		BankAccount b = (BankAccount) o;
		return accNo== b.accNo &&
				Double.compare(balance, b.balance)==0 &&
				name.equals(b.getName());
		
	}
	
	
	public int hashCode() {
		return Objects.hash(accNo,name,balance);
	}
}
