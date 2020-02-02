package javafifty;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//How to convert an array into a collection?
public class ArrayToCollection 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter How many element u want to enter: ");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			int n= Integer.parseInt(br.readLine());
			String[] s= new String[n];
			for (int i = 0; i < s.length; i++) 
			{
				System.out.print("Enter "+i+" element: ");
				s[i]=br.readLine();
			}
			//System.out.println("Array: "+s.length);
			List<String> li= Arrays.asList(s);
			System.out.println("List: "+li);
			System.out.println("2nd Sol: "+toList(s));
			
		} 
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> toList(String[] array) {
	    if (array==null) 
	    {
	       return new ArrayList<>(0);
	    } 
	    else 
	    {
	       int size = array.length;
	       List<String> list = new ArrayList<>(size);
	       for(int i = 0; i < size; i++) 
	       {
	          list.add(array[i]);
	       }
	       return list;
	    }
	}
}
