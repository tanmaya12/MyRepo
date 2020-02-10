package java8;

import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String s="Tanmaya";
		Map<String, Long> collect = s.chars().mapToObj(i-> (char)i).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
//		for (Entry<String, Long> en : collect.entrySet()) {
//			System.out.println(en.getKey()+" "+en.getValue());
//		}
		
		collect.forEach((k,v)-> System.out.println(k+" : "+v));
		
		
		
	}

}
