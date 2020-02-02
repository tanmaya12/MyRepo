package javademo;

public class DuplicateElementInArray 
{
	public static void main(String[] args) 
	{
		int a[]= {21,2,19,7,0,102,45,87,98,5,5,102,19,1,2};
		
		for (int i : a) 
		{
			System.out.print(i+",");
		}
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if((a[i]==a[j])&&(i!=j))
				{
					System.out.print(a[i]+",");
				}				
			}
		}
	}
}
