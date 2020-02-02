package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountCharacters {
	public static void main(String[] args) {
		String s="tanmaya kumar begera$11232";
		Map<Character,Integer> m= new HashMap<Character, Integer>();
		char[] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (m.containsKey(ch[i])) {
				m.put(ch[i], m.get(ch[i])+1);
			} else {
				m.put(ch[i], 1);
			}
		}
		for (Entry<Character, Integer> en : m.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
