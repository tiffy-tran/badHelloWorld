package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EntryPoint {
	
	public static void main (String[] args){
		
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader("D:\\workspace\\letters.txt");
			br = new BufferedReader(fr);
			
			String line;
			char[] chars = null;
			while((line = br.readLine()) != null) {
				chars = line.toCharArray();
			}
			
			List<Vowel> vowels = new ArrayList<Vowel>();
			List<Consonant> consonants = new ArrayList<Consonant>();
			
			for (int i=0; i<chars.length; i++) {
				char c = chars[i];
				switch (c) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						vowels.add(new Vowel(c));
						break;
					default:
						consonants.add(new Consonant(c));
						break;
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	
		
		
	}

}
