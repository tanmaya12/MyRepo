package javafifty;

public class LargestFrom3No 
{
	public static void main(String[] args) 
	{
		int n1=-23, n2=56, n3= 8765;
		if (n1>n2 && n1>n3)
		{
			System.out.println(n1+" is greater");
		} 
		else if (n2>n3 && n2>n1) 
		{
			System.out.println(n2+" is greater");
		} 
		else 
		{
			System.out.println(n3+" is greater");
		}
	}
}
