package javaexercise;

public class DiagonalArraySumation
{
	public static void main(String[] args) 
	{
		int[] n[]= {{1,2,9},{4,5,6},{7,8,9}};
		int sum=0;
		for (int i = 0; i < n.length; i++) 
		{
			sum+=n[i][i]; //left corner to right
		}
		System.out.println("Sum of left diagonals= "+sum);
		right2Left(n);
	}
	private static void right2Left(int n[][]) 
	{
		int sum=0;
		for (int i = 0,j=n[i].length-1; i < n.length; i++,j--) 
		{
			sum+=n[i][j];
		}
		System.out.println("Sum of left diagonals= "+sum);
	}

}
