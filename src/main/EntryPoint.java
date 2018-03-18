package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryPoint {
	
	public static void main (String[] args){
		

			char[] chars = {(char) Letters.A.getValue(), (char) Letters.B.getValue(), (char) Letters.C.getValue(), (char) Letters.D.getValue(), (char) Letters.E.getValue(), 
					(char) Letters.F.getValue(), (char) Letters.G.getValue(), (char) Letters.H.getValue(), (char) Letters.I.getValue(), 
					(char) Letters.J.getValue(), (char) Letters.K.getValue(), (char) Letters.L.getValue(), (char) Letters.M.getValue(), (char) Letters.N.getValue(), 
					(char) Letters.O.getValue(), (char) Letters.P.getValue(), (char) Letters.Q.getValue(), (char) Letters.R.getValue(), 
					(char) Letters.S.getValue(), (char) Letters.T.getValue(), (char) Letters.U.getValue(), (char) Letters.V.getValue(), (char) Letters.W.getValue(),
					(char) Letters.X.getValue(), (char) Letters.Y.getValue(), (char) Letters.Z.getValue()};
			
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
			
			Map<Integer, String> map = new HashMap<Integer, String>();
			for(Vowel v : vowels) {
				if (v.getValue() == 'e' || v.getValue() == 'o') {
					map.put(new Integer(v.getIntValue()), Character.toString(v.getValue()));
				} else {
					System.out.println("Got "+v+" instead.");
				}
			}
			
			Map<Integer, String> map2 = new HashMap<Integer, String>();
			for (Consonant c : consonants) {
				if (c.getValue() == 'h' || c.getValue() == 'l' || c.getValue() == 'w' || c.getValue() == 'r' || c.getValue() == 'd') {
					map2.put(new Integer(c.getIntValue()), Character.toString(c.getValue()));
				} else {
					System.out.println("Got "+c+" instead.");
				}
			}
			
		
	}

}
