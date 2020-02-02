package javaexercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertMap2List {

	public static void main(String[] args) {
		
		HashMap<String, String> map= new HashMap<>();		
		map.put("a", "tanmay");
		map.put("b", "cav");
		map.put("n", "value");
		
		Set<String> sk=map.keySet();
		ArrayList<String> alk= new ArrayList<>();
		alk.addAll(sk);
		for (String str : alk) {
			System.out.println(str);
		}
		Collection<String> sv=map.values();
		ArrayList<String> alv= new ArrayList<>();
		alv.addAll(sv);
		for (String str : alv) {
			System.out.println(str);
		}
		Collections.unmodifiableMap(map);
		
		
		//using java 8
		
		System.out.println("\n\nUsing Java8\n");
		List<String> lk= map.keySet().stream().collect(Collectors.toList());
		//List<String> lk= map.keySet().stream().sorted().collect(Collectors.toList());
		lk.forEach(System.out::println);
		
		List<String> lv= map.values().stream().collect(Collectors.toList());
		//List<String> lv= map.values().stream().sorted().collect(Collectors.toList());
		lv.forEach(System.out::println);
		
	}

}
