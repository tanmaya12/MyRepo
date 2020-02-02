package javademo;
import java.util.Arrays;

public class RemoveDuplicateInArray 
{
	public static int remove(int a[],int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int k=0;
		int[] temp= new int[n];
		for (int i = 0; i < n-1; i++) 
		{	
			if((a[i]!=a[i+1]))
				{
					temp[k++]=a[i];
					//System.out.print(a[i-1]+",");
				}
			
		}
		temp[k++]= a[n-1];
		for (int i=0 ;i<k;i++) {
			a[i]=temp[i];
		}
		return k;
	}
	public static void main(String[] args) 
	{
		int a[]= {21,2,19,7,0,102,45,87,98,5,5,102,19,1,2};
		int len= a.length;
		Arrays.sort(a);
		for (int i : a) 
		{
			System.out.print(i+",");
		}
		len= remove(a,len);	
		System.out.println();
		for (int i = 0; i < len; i++) {
			System.out.print(a[i]+",");
		}
	}

}
