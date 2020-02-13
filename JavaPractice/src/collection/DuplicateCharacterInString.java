package collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
//find 1st duplicate character in a string
public class DuplicateCharacterInString {

	public static void main(String[] args) {
		String s="tanmaua khht";
		LinkedHashMap<Character, Integer> m= new LinkedHashMap<Character, Integer>();
		
		char[] ch=s.toCharArray();
		for (char c : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}else {
				m.put(c, 1);
			}
		}
		for(Entry<Character, Integer> en: m.entrySet()) {
			//System.out.println(en.getKey()+" : "+en.getValue());
			if(en.getValue()>1) {
				System.out.println("1st duplicate character: "+ en.getKey()); break;
			}
		}
		
	}

}
