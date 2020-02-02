package javaexercise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintKeysValues {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Tanu");
		map.put(2, "Cabu");
		map.put(3, "Ranu");
		map.put(4, "Zanu");
		System.out.println(map);
		Set<Entry<Integer, String>> set= map.entrySet();
		Iterator<Entry<Integer, String>> it= set.iterator();
		System.out.println(it);
		
		while (it.hasNext()) 
		{			System.out.println(it.next());			}
		
		System.out.println("----------2nd way--------");
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
