package javademo;

public class ArrangeArray 
{
	public static void main(String[] args) 
	{
		int a[]= {19,21,2,7,0,45,87,98,102,5,19,1,2};
		int largest=a[0],secondlargest=a[0],temp=0;
		
		for (int i = 0; i < a.length; i++) 
		{ 
			if (a[i]>largest) 
			{
				secondlargest= largest;
				largest=a[i];
			}			
			else if (a[i]>secondlargest) 
			{
				secondlargest=a[i];				
			}
		}
		for (int k : a) 
		{
			System.out.print(k+",");
		}	
		System.out.println("\nLargest No.: "+largest+"\nSecond Largest: "+secondlargest);
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i]<a[j]) 
				{
					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i : a) 
		{
			System.out.print(i+",");			
		}
		System.out.println("\n2nd Largest: "+a[a.length-2]+"\n3rd smallest: "+a[2]);
	}
}
