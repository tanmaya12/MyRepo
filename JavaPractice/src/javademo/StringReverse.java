package javademo;
import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string:");
		String Istr=s.nextLine(),Ostr="";
		for (int i = Istr.length()-1; i >=0; i--) 
		{
			Ostr=Ostr+Istr.charAt(i);
		}		
		System.out.println(Ostr);
	}
}
