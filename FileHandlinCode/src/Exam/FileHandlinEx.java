package Exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlinEx {

	public static void main(String[] args) throws IOException {
		String filename = "examfile.txt";
		
			
		
		FileWriter writer = new FileWriter(filename);
		writer.write("Total number of word Total number of vowels Total number of white spaces Great! Below is the enhanced version of your Java file handling code that includes:Total number of lines");
		writer.close();
		System.out.println("file write succesfully...");
		
		int wordcount =0;
		int linecount =0;
		int spacecount =0;
		int vowelscnt =0;
		
		FileReader reader = new FileReader(filename);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("file content is : ");
		String line;
		while((line =br.readLine())!=null) {
			System.out.println(line);
			
			linecount++;
			
			//split by whitespace to cnt words
			String[] words = line.trim().split("\\s+");
			wordcount += words.length;
			
			
			//voewl and space count
			for(char ch:line.toLowerCase().toCharArray()) {
				if("aeiou".indexOf(ch)!=-1) {
					vowelscnt++;
				}
				if(ch==' ') {
					spacecount++;
				}
			}
		}
		br.close();
		reader.close();
		
		System.out.println("file analysis:----");
		System.out.println("no of words: "+wordcount);
		System.out.println("no of lines: "+linecount);
		System.out.println("no of vowels: "+vowelscnt);
		System.out.println("no of spacees: "+spacecount);
	}
}
