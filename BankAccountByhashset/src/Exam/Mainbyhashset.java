package Exam;

import java.util.HashSet;

public class Mainbyhashset {

	public static void main(String[] args) {
		
		HashSet<BankAccount> accountset = new HashSet<>();
		
		accountset.add(new BankAccount(1234, "vikrant", 45000.05));
		accountset.add(new BankAccount(1234, "vikrant", 45000.05));
		accountset.add(new BankAccount(1235, "tejas", 46079.05));
		
		
		
		for(BankAccount bset:accountset) {
			
		
			System.out.println(bset);
		}
	}
}
