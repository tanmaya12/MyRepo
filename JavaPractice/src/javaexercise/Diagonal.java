package javaexercise;
import java.util.ArrayList;
import java.util.Arrays;
public class Diagonal 
{
	public static void main(String[] args) 
	{
		ArrayList<String> li= new ArrayList<>(Arrays.asList("123","456","789"));
		Object[] obj= li.toArray();
		char[] ch = null;
		int sum=0;
		for (int i = 0; i < obj.length; i++) 
		{
			for (int j = 0; j < obj[i].toString().length(); j++) 
			{
				ch= obj[i].toString().toCharArray();				
			}
			System.out.println(obj[i]+" "+ch[i]);
			sum+= Character.getNumericValue(ch[i]);
		}
		System.out.println("Sum of diagonals= "+sum);

	}
}
