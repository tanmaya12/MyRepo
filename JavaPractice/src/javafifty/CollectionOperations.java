package javafifty;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

//Perform the Basic operations: adding, retrieving, updating, removing elements using collections
public class CollectionOperations 
{
	public static void main(String[] args) 
	{
		List<String> li= new LinkedList<>(Arrays.asList("tanmay","kumar","9090","cabu","2345"));
		System.out.println("Before add: "+li);
		li.add("MANA");
		li.add(2,"Bahera");
		System.out.println("After add:"+li);
		li.remove("2345");
		System.out.println("After remove: "+li);
		li.set(1, "TANU");
		System.out.println("After update: "+li);
		Collections.sort(li);
		System.out.println(li);
	}
}
