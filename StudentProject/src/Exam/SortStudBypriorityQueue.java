package Exam;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class SortStudBypriorityQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Student> studqu = new PriorityQueue<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				
				return s2.marks - s1.marks;
			}
		});
		
		
		
		System.out.println("entery no of student: ");
		int noOfs = sc.nextInt();
		
		for(int i=0;i<noOfs;i++) {
			System.out.println("enter name : ");
			String name = sc.next();
			
			System.out.println("enter marks");
			int marks = sc.nextInt();
			
			studqu.add(new Student(name,marks));
		}
		
		//display student by using priorityq
		while(!studqu.isEmpty()) {
			System.out.println(studqu.poll());
		}
	}
}
