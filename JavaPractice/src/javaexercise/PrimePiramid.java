package javaexercise;

public class PrimePiramid {

	public static void main(String[] args) {
		int rows=5,num=2;
		for (int i = 1; i <=rows; i++) //for row
		{
			for (int j = rows-i; j >=1; j--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				while(!isPrime(num))
				{					
					num++;
				}
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static boolean isPrime(int num)
	{		
			int i=2,count=0;
			while(count<=1 && num!=i)
			{
				if(num%i==0)
				{	count++;	}				
				i++;
			}
			if (count>=1) {
				return false;
			} else {
				return true;
			}
	}

}
