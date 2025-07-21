package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Student> Studlist = new ArrayList<>();
		
		System.out.println("enter no of student you want to add:");
		int noofstud = sc.nextInt();
		
		for(int i=0;i<noofstud;i++) {
			System.out.println("enter rollno:");
			int rollno = sc.nextInt();
			
			System.out.println("enter Name:");
			String name = sc.next();
			
			System.out.println("enter marks:");
			int marks = sc.nextInt();
			
			Studlist.add(new Student(rollno,name,marks));
			
		}
		
		System.out.println("====================================\n");
		
		//display student
		System.out.println("student records are\n:");
		for(Student stud:Studlist) {
			System.out.println(stud);
		}
		
		//highest marks
		Student top = Studlist.get(0);
		for(Student stud:Studlist) {
			if(stud.marks>top.marks) {
				top = stud;
			}
		}
		
		System.out.println("student with highest marks is :");
		System.out.println(top);
		
		
		System.out.println("====================================\n");
		//seach stud by roll no
		
		System.out.println("enter rollno do you want to search:");
		int searchroll = sc.nextInt();
		boolean studfound = false;
		for(Student s:Studlist) {
			if(s.rollno==searchroll) {
				System.out.println("student found: "+s);
				studfound = true;
			}
		}
		
		if(studfound==false) {
			System.out.println("there is no student with rollno is: "+searchroll);
		}
	}
}

