package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_StringJoin {
	public static void main(String args[]) {

		List<String> books = Arrays.asList("Effective Java", "Clean Code", 
		"Java Concurrency in Practice");
		System.out.println(books);

		String bookString = String.join(",", books);
		System.out.println(bookString);

		Set<String> authors = new HashSet<>(Arrays.asList("Josh Bloch", "Uncle Bob Martin",
		 "Brian Goetz"));
		System.out.println(authors);

		String authorString = String.join(",", books);
		System.out.println(authorString);


		}	

}
