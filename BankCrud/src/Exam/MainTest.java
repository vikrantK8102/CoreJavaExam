package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest {

	static Scanner sc = new Scanner(System.in);
	static List<Account> Acclist = new ArrayList<>();
	
	public static void addAccount() {
		System.out.println("enter acc no:");
		int accno = sc.nextInt();
		
		System.out.println("enter name:");
		String name = sc.next();
		
		System.out.println("enter balace:");
		double balance = sc.nextDouble();
		
		System.out.println("enter account type(1-saving account || 2-current account");
		int type = sc.nextInt();
		
		if(type==1) {
			Acclist.add(new SavingAccount(accno,name,balance));
		}
		else if(type==2) {
			Acclist.add(new CurrentAccount(accno,name,balance));
		}
		else {
			System.out.println("invalid type.....");
		}
		System.out.println("===================================");
	}
	
	//view account
	public static void viewAllAccount() {
		for(Account a:Acclist) {
		 System.out.println(a.getDetails());
		}
		System.out.println("===================================");
	}
	
	//update account
	public static void updateAccount() {
		System.out.println("enter accountno to update:");
		int accno = sc.nextInt();
		
		
		for(Account a:Acclist) {
			if(a.accNo==accno) {
				System.out.println("enter amount to add in account:");
				a.UpdateBalance(sc.nextDouble());
				return;
			}
		}
		System.out.println("account not found...");
		System.out.println("===================================");
	}
	
	//delete account
	public static void deleteAccount() {
		System.out.println("enter account no to delete:");
		int accno = sc.nextInt();
		
		for(Account a:Acclist) {
			if(a.accNo==accno) {
				System.out.println("are you sure you want to delete account then enter:1");
				int sure = sc.nextInt();
				if(sure==1) {
					Acclist.remove(accno);
					return;
				}
			}
		}
		System.out.println("account no not found");
	}
	
	//main
	public static void main(String[] args) {
		while(true) {
			System.out.println("/n 1.Add  2.viewAll 3.update 4.delete 5.Exit");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:addAccount();break;
			case 2:viewAllAccount();break;
			case 3:updateAccount(); break;
			case 4:deleteAccount(); break;
			case 5:System.exit(0);
			default :System.out.println("enter valid choice...");
			}
		}
		
	}
}


