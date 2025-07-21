package Exam;

import java.util.Scanner;

public class SimpleLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter username:");
		String username = sc.next();
		
		System.out.println("enter password:");
		String password = sc.next();
		
		try {
			if(username.equals("admin") && password.equals("1234")) {
				System.out.println("login succesful!!");
			}
			else {
				throw new InvalidUserException("invalid uname and pass");
			}
		}
		catch(InvalidUserException e) {
			System.out.println("Error : "+ e.getMessage());
		}
		
	}
}
