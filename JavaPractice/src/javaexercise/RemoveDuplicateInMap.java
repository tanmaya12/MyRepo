package javaexercise;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateInMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Tanu");
		map.put(2, "Cabu");
		map.put(3, "Ranu");
		map.put(5, "Tanu");
		map.put(4, "Zanu");
		map.put(6, "Tanu");
		map.put(7, "Ranu");
		map.put(8, "Ranu");
		System.out.println(map.size());
		for (Entry<Integer,String> ent : map.entrySet()) 
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		Collection<String> col= map.values();
		Iterator<String> it= col.iterator();
		while(it.hasNext())
		{
			String value= it.next();
			//Collections.reverse();
			if(Collections.frequency(col, value)>1)
			{
				it.remove();
			}
		}
		System.out.println(map);

	}

}
