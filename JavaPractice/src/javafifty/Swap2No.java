package javafifty;
import java.util.Scanner;

public class Swap2No 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int n1= Integer.parseInt(s.nextLine());
		System.out.println("Enter 2nd No:");
		int n2= Integer.parseInt(s.nextLine());
		
		//without temporary variable
		System.out.println("Before swap:"+n1+" "+n2);
//		n1=n1+n2;
//		n2=n1-n2;
//		n1=n1-n2;
		
//		n1=n1*n2;
//		n2=n1/n2;
//		n1=n1/n2;
		
//		n1=n1^n2;
//		n2=n1^n2;
//		n1=n1^n2;
		
		n2=n1+n2-(n1=n2);
		
		System.out.println("After swap:"+n1+" "+n2);
		//with temporary variable
		System.out.println("With temp Before swap:"+n1+" "+n2);
		
		int temp=n1;	n1=n2;	n2=temp;
		
		System.out.println("With temp After swap:"+n1+" "+n2);
		s.close();
	}
}
