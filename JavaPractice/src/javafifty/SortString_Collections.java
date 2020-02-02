package javafifty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write code to sort the list of strings using Java collection?
public class SortString_Collections
{	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		List<String> li= new ArrayList<>();
		System.out.println("How many Strings u want to enter: ");
		int n= Integer.parseInt(s.nextLine());		
		for (int i = 0; i < n; i++) 
		{
			System.out.print("Enter Words: ");
			//li.add((int)Integer.parseInt(s.nextLine()));
			li.add(s.nextLine());
		}
		s.close();
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		

	}
}
