package java8;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharInString {

	public static void main(String[] args) {
		String s="tanmaya kumar behera";
		HashMap<Character, Integer> hm= new HashMap<Character, Integer>(); //for ascending key 
		s.chars().forEach(c -> hm.put((char) c, hm.getOrDefault((char)c, 0)+1));
		System.out.println(hm);
		
		//hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);	
		//hm.entrySet().stream().sorted((a,b)-> b.getValue()- a.getValue()).forEach(System.out::println);
		Map<Integer, List<Entry<Character, Integer>>> collect = hm.entrySet()
		.stream()
		.sorted((x,y)-> y.getValue()-x.getValue())
		.collect(Collectors.groupingBy(k-> hm.get(k), TreeMap::new, Collectors.toList()));
		System.out.println(collect);
		
		
		Map<Character, Long> map = s.chars()  // creates an IntStream
										.mapToObj(ch->(char)ch) // converts the IntStream to Stream<Character>
										.collect(Collectors.groupingBy(ch->ch , Collectors.counting())); // creates a
        // Map<Character, Long> 
        // where the Long is
        // the frequency
		
		System.out.println(map);
		
		
	}
	
	static Map<String, Integer> sortByValue(Map<String, Integer> wordCounts) {
		//compareTo method for sorting
        return wordCounts.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        //reverse order by value
//        return wordCounts.entrySet().stream().sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

   

    }

}
