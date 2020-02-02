package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class SortedMapUsingComparator {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(20, "java");
		map.put(2, "c#");
		map.put(56, "c++");
		map.put(-3, "perl");
		map.put(15, "angular");
		
		//sol1
		List<Entry<Integer, String>> ls= new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		Collections.sort(ls, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
		for (Entry<Integer, String> ent : ls) {
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		System.out.println("-----------------------------");
		
		//sol2
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("--------------by value---------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
