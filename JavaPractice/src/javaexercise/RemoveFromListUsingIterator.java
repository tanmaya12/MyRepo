package javaexercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveFromListUsingIterator {

	public static void main(String[] args) {
		List<Integer> li= new ArrayList<>(Arrays.asList(1,2,3,5,7,1));
		System.out.println(li);
		li.add(26);
		li.add(21);
		li.add(0);
		li.add(66);
		System.out.println(li);
		Iterator<Integer> it= li.iterator();
		for (Integer intger : li) 
		{
			System.out.print(intger+", ");
		}
		
		System.out.println();
		System.out.println(li);
		//li.clear();
		while(it.hasNext())
		{
			int i=0;
			li.remove(i);
		}		
		System.out.println(li);
	}

}
