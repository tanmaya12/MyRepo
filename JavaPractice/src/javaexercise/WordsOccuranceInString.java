package javaexercise;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsOccuranceInString 
{
	public static void main(String[] args) 
	{
		String s="tanmay kumar behera cabu tanmay kumar cabu";
		List<String> li= Arrays.asList(s.split(" "));
		System.out.println(li);
		Set<String> uniq= new HashSet<String>(li);
		for (String word : uniq) 
		{
			int count= Collections.frequency(li, word);
			System.out.println(word+" : "+count);
		}

	}

}
