package Exam;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Emergencytretment {

	public static void main(String[] args) {
		Queue<Patient> patient = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("entery no of patient: ");
		int noOfp = sc.nextInt();
		
		for(int i=0;i<noOfp;i++) {
			System.out.println("enter name of patient: ");
			String name = sc.next();
			
			System.out.println("enter priority of patient between(1-5) 1=low--5=high: ");
			int priority = sc.nextInt();
			
			patient.add(new Patient(name,priority));
		}
		
		//dispaly patient based on priorityf
		System.out.println("patients are : --");
		while(!patient.isEmpty()) {
			System.out.println(patient.poll().getName()+" is treated");
		}
		
		
		
	}

}
