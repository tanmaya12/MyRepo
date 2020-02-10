package java8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String s= "tanmaya kumar behera";
		List<Character> li=s.chars().mapToObj(i-> (char)i).collect(Collectors.toList());
		System.out.println(li);
		List<Character> collect = li.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}
