package Exam;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class WordFreqncy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> wordfrq = new HashMap<>();
		
		System.out.println("enter line for counting word frquncy");
		String para = sc.nextLine();
		
		String[] words = para.split("\\s+");
		
		for(String word:words) {
			word = word.toLowerCase();
			wordfrq.put(word, wordfrq.getOrDefault(word,0)+1);
		}
		
		//displayword frqncies
		for(Entry<String, Integer> newmap:wordfrq.entrySet()) {
			System.out.println(newmap.getKey()+" - "+newmap.getValue());
		}
	
	
		
		
		
	}
	

	}
