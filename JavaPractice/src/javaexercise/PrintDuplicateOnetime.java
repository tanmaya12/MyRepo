package javaexercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicateOnetime 
{

	public static void main(String[] args) 
	{
		List<String> li = new ArrayList<String>(Arrays.asList("a","f","b","c","d","a","c","a","z","c","d","f"));
		HashSet<String> hs= new HashSet<>();
		System.out.println(li);
		for (int i = 0; i < li.size(); i++) 
		{
			if(i==li.size())
				break;
			for (int j = i+1; j < li.size(); j++)
			{
				if (li.get(i).equalsIgnoreCase(li.get(j))) 
				{
					//System.out.print(li.get(j)+" ");
					hs.add(li.get(i));
				}
			}
		}
		System.out.println(hs);

	}
}
