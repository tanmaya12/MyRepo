package javaexercise;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class CharacterOccurance2 
{
	public static void main(String[] args)
	{
		String s="MAVERIC_CHENNAI";
		Map<Character,Integer> m= new HashMap<>();
		char[] ch= s.toCharArray();
		for (char c : ch) 
		{
			if (m.containsKey(c)) 
			{
				m.put(c, m.get(c)+1);
			} else {
				m.put(c, 1);
			}
		}
		for (Entry<Character, Integer> ent : m.entrySet()) 
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}

	}
}
