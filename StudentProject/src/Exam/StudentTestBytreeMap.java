package Exam;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StudentTestBytreeMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> studMap = new TreeMap<>();
		System.out.println("enter how many student you add---->");
		int studCnt = sc.nextInt();
		
		for(int i=0;i<studCnt;i++) {
			System.out.println("enter name:");
			String name = sc.next();
			
			System.out.println("enter marks :");
			int marks = sc.nextInt();
			
			studMap.put(name, marks);
		}
		
		//display student with marks in decrsing order:
		System.out.println("display student with marks in decrsing order(A-Z) are :");
		for(Map.Entry<String, Integer> entery:studMap.entrySet()) {
			System.out.println("name : "+entery.getKey()+" - marks : "+entery.getValue());
		}
		
		
		//if marks are same then acending order by name
		System.out.println("display asce by name:");
		for(Map.Entry<String, Integer> entry:studMap.descendingMap().entrySet()) {
			System.out.println("name: "+entry.getKey()+"- marks: "+entry.getValue());
		}
	}
	
	
	
}
