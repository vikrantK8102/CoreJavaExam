package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<ISaveble> Characters = new ArrayList<ISaveble>();
		
		System.out.println("enter how many player you want to add?");
		int playercnt = sc.nextInt();
		
		for(int i=0;i<playercnt;i++) {
			System.out.println("enter name:");
			String name = sc.next();
			
			System.out.println("enter hitpoint:");
			int hitpoint = sc.nextInt();
			
			System.out.println("enter strength:");
			int strength = sc.nextInt();
			
			System.out.println("enter weapon:");
			String weapon = sc.next();
			
			Player player = new Player(name,hitpoint,strength,weapon);
			Characters.add(player);
		}
		
		
		System.out.println("enter how many Monter you want to add?");
		int monstercnt = sc.nextInt();
		
		for(int i=0;i<monstercnt;i++) {
			System.out.println("enter name:");
			String name = sc.next();
			
			System.out.println("enter hitpoint:");
			int hitpoint = sc.nextInt();
			
			System.out.println("enter strength:");
			int strength = sc.nextInt();
			
			
			
			Monster monster = new Monster(name,hitpoint,strength);
			Characters.add(monster);
		}
		
		System.out.println("\nall characters are added:");
		
		for(ISaveble Character:Characters) {
			System.out.println(Character.toString());
		}
	}
}



