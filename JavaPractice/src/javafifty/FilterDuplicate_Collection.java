package javafifty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set; 
import java.util.stream.Collectors;


// Write code to filter duplicate elements from an array and print as a list?
public class FilterDuplicate_Collection
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		ArrayList<String> al= new ArrayList<String>();
		System.out.println("Enter size of List: ");
		int n= Integer.parseInt(s.nextLine());
		for (int i = 0; i < n ; i++) 
		{
			System.out.print("Enter "+i+" : ");
			al.add(s.nextLine());
		}
		s.close();
		System.out.println("Original List:\n"+al);
		removeDuplicateString(al);// sort for all
		removeDuplicateInteger();// sort for Integers
	}
	//remove duplicate integers
	static void removeDuplicateInteger() 
	{
		ArrayList<Integer> al= new ArrayList<>(Arrays.asList(1,2,4,6,1,87,67,2,2,1,4,6));
		System.out.println("Original List:\n"+al);
		List<Integer> li= al.stream().distinct().collect(Collectors.toList());
		al.clear();
		al.addAll(li);
		System.out.println("Filtered List:\n"+al);	
		
	}
	//remove duplicate Strings
	private static void removeDuplicateString(ArrayList<String> al) 
	{
		Set<String> s= new LinkedHashSet<String>(al);
		al.clear();
		al.addAll(s);
		System.out.println("Filtered List:\n"+al);		
	}
}
