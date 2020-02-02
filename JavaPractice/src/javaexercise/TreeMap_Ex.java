package javaexercise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap_Ex {

	public static void main(String[] args) {
		String s= "tanmaya kumar";
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
		char[] ch= s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if (hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			} else {
				hm.put(ch[i], 1);
			}			
		}
		for(Entry<Character, Integer> ent: hm.entrySet())
		{System.out.println(ent.getKey()+" "+ent.getValue());}
		
		System.out.println("------------------TreeMap---------------");
		
		TreeMap<Character, Integer> tm= new TreeMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) 
		{
			if (tm.containsKey(ch[i])) {
				tm.put(ch[i], tm.get(ch[i])+1);
			} else {
				tm.put(ch[i], 1);
			}			
		}
		for(Entry<Character, Integer> ent: tm.entrySet())
		{System.out.println(ent.getKey()+" "+ent.getValue());}
	}

}
