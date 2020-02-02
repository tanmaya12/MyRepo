package javaexercise;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Ex {

	public static void main(String[] args) 
	{
		LinkedList<Integer> li= new LinkedList<>(Arrays.asList(1,3,9,4,12,-2,34));
		System.out.println(li);
		li.addFirst(10);
		li.add(4, 98);
		//li.remove(2);
		System.out.println(li);
		int len=0;
		for(Iterator<Integer> it= li.iterator(); it.hasNext(); it.next())
		{
			len++;
		}
		System.out.println(len);
		System.out.println("Middle of list= "+li.get(len/2));
		li.stream().forEach(System.out::println);
		
	}

}
