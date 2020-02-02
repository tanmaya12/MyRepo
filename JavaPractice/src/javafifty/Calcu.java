package javafifty;
import java.util.ArrayList;
import java.util.Scanner;

public class Calcu 
{
	public static void main(String[] args) 
	{
		//Scanner str= new Scanner(System.in);
		System.out.println("Enter values with +: ");
		//String s=str.nextLine();
		String s= "123+123*123-123/123=";
		if (s==null) 
		{
			System.out.println("enter values.");
		}
		if (s.charAt(s.length()-1)!='=') 
		{
			System.out.println("Enter = at last.");
		}
		
		String[] ary= s.split("\\+");
		ArrayList<String> al= new ArrayList<>();		
		for (int i = 0; i < ary.length; i++) 
		{
			al.add(ary[i]);
			//System.out.println(al);
		}
		double sum=0;
		for (int i = 0; i < al.size(); i++) 
		{
			sum+= Double.parseDouble(al.get(i).toString());
		}
		System.out.println(sum);
				
	}
}
