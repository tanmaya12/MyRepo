package javademo;

public class CountDigit 
{
	public static void main(String[] args) 
	{
		long n= 3456;
		long m,sum=0,count=0;
		while (n>0) 
		{
			count++;
			m= n % 10;
			sum+=m;
			n/=10;
		}		
		System.out.println(sum+" "+count);
		//System.out.println(count);
	}
}
